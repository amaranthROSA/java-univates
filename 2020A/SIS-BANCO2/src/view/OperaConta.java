/**
 * 
 */
package view;

import javax.swing.JOptionPane;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import dao.ContasDAO;
import model.Conta;
import model.Data;
import model.Movimento;

/**
 * @author amaranth.rosa
 *
 */

public class OperaConta {

	private Conta conta;

	/* ----- VARIÁVEIS TRANSITÓRIAS ----- */
	String codigoCliente;
	String menuOp;
	String op;

	public OperaConta(Conta conta) {
		setConta(conta);
	}

	public void exibir() {
		String menuOp = JOptionPane.showInputDialog("MENU\n\n" + "[1] Depositar\n" + "[2] Sacar\n"
				+ "[3] Consultar Saldo/Limite\n" + "[4] Tranferir\n" + "[5] Definir limite\n" + "[6] Pagar boleto\n"
				+ "[7] Pagar cheque\n" + "[8] Extrato\n" + "[9] Desbloquear conta\n" + "[x] Sair\n\n");

		String valor;
		switch (menuOp) {
		case "1":
			valor = JOptionPane.showInputDialog("Informe o valor a depositar");
			depositar(conta, Double.parseDouble(valor));
			break;
		case "2":
			valor = JOptionPane.showInputDialog("Informe o valor a sacar");
			sacar(conta, Double.parseDouble(valor));
			break;
		case "3":
			JOptionPane.showMessageDialog(null, consultar(conta));
			break;
		case "4":
			valor = JOptionPane.showInputDialog("Informe o valor a ser transferido: ");
			String codCliDest = JOptionPane.showInputDialog("Código de cliente da conta de destino: ");

			Conta contaDest = null;
			ContasDAO dao = new ContasDAO();
			try {
				conta = dao.encontrarConta(Long.parseLong(codCliDest));
				if (contaDest != null)
					transferir(contaDest, Double.parseDouble(valor));
			} catch (ParseException pse) {
				pse.printStackTrace();
			}

			break;
		case "5":
			String limite = JOptionPane.showInputDialog("Informe o limite da conta (em R$)");
			definirLimite(conta, Double.parseDouble(limite));
			break;
		case "6":
			valor = JOptionPane.showInputDialog("Informe o valor do boleto: ");
			pagarBoleto(Double.parseDouble(valor));
			break;
		case "7":
			valor = JOptionPane.showInputDialog("Informe o valor do cheque: ");
			pagarCheque(Double.parseDouble(valor));
			break;
		case "8":
			System.out.println(getExtratoConta());
			break;
		case "9":
			desbloquearConta();
			break;
		case "x":
			JOptionPane.showMessageDialog(null, "Encerrando operações na conta.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada.");
			break;
		}
	}

	public void depositar(Conta conta, double valor) {

		conta.depositar(conta, valor);

		/* Adiciona movimentação */
		Movimento mv = new Movimento(conta, new Data());
		conta.addMovimento(mv);

		exibir();
	}

	public void sacar(Conta conta, double valor) {
		conta.sacar(conta, valor);

		/* Adiciona movimentação */
		Movimento mv = new Movimento(conta, new Data());
		conta.addMovimento(mv);

		exibir();
	}

	public void definirLimite(Conta conta, double limite) {
		conta.setLimite(limite);
		JOptionPane.showMessageDialog(null, "O limite da conta agora é: " + conta.getLimite());
	}

	public String consultar(Conta conta) {
		StringBuilder stb = new StringBuilder();
		stb.append("Saldo: R$" + conta.getSaldo());
		stb.append("\nLimite R$: " + conta.getLimite());

		return stb.toString();

	}

	/* Retira o valor da conta atual e transfere para a conta de "destino" */
	public void transferir(Conta contaDestino, double valor) {
		conta.sacar(conta, valor);
		contaDestino.depositar(contaDestino, valor);

		/* Adiciona movimentação */
		Movimento mv = new Movimento(conta, new Data());
		conta.addMovimento(mv);

		exibir();
	}

	public void pagarBoleto(double valor) {
		conta.sacar(conta, valor);
		JOptionPane.showMessageDialog(null, "Boleto no valor de R$ " + valor + " foi pago.");

		exibir();
	}

	public void pagarCheque(double valor) {
		if (conta.getSaldo() < valor) {
			conta.setContaBloqueada(true);
			JOptionPane.showMessageDialog(null, "Cheque sem fundo detectado!\nA conta foi bloqueada.");
		} else {
			conta.sacar(conta, valor);
			JOptionPane.showMessageDialog(null, "Cheque no valor de R$ " + valor + " pago.");
		}

		exibir();
	}

	public String getExtratoConta() {
		StringBuilder stb = new StringBuilder();
		stb.append("----------------------EXTRATO BANCÁRIO----------------------");
		stb.append("\nProprietário: " + conta.getCliente().getNome() + " " + conta.getCliente().getSobrenome());
		stb.append("\nSaldo: R$ " + conta.getSaldo());
		stb.append("\nÚltima movimentação: " + conta.getUtlimaMovimentacao().getDataMovimentacao().obterDiaMesAno()
				+ "\n");

		return stb.toString();

	}

	public void desbloquearConta() {
		conta.setContaBloqueada(false);
		JOptionPane.showMessageDialog(null, "A conta foi desbloqueada!");

		exibir();
	}

	/* ----- GETTERS AND SETTERS ----- */

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Conta getConta() {
		return conta;
	}

}
