/**
 * 
 */
package br.univates.samuel.pratica07.sis_banco;

import javax.swing.JOptionPane;

import br.univates.samuel.pratica07.sis_banco.model.Conta;

/**
 * @author amaranth.rosa
 *
 */

/* Classe designada a fazer opera��es nas contas */
public class OperaConta {

	Conta conta;

	/* Armazena c�digo do cliente para o sistema */
	String codigoCliente;
	String menuOp;
	String op;

	public OperaConta(Conta conta) {
		this.conta = conta;
	}

	public void exibir() {
		String menuOp = JOptionPane.showInputDialog("MENU\n\n" + "[1] Depositar\n" + "[2] Sacar\n"
				+ "[3] Consultar Saldo\n" + "[4] Tranferir\n" + "[x] Sair\n\n");

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
			/* Implementar fun��es de tranfer�ncia */
			break;
		case "x":
			JOptionPane.showMessageDialog(null, "Encerrando opera��es na conta.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Op��o n�o encontrada.");
			break;
		}
	}

	/* Busca conta pelo c�digo e setta ela na vari�vel */
	public void encontrarConta(String codigoCliente) {

		for (Conta conta : BancoTela.contas) {

			if (conta.getCliente().getCodigoCliente().equals(codigoCliente)) {

			}
		}
	}

	public void depositar(Conta conta, double valor) {

		conta.depositar(conta, valor);

		JOptionPane.showMessageDialog(null, "Depositado valor de R$ " + valor + " para "
				+ conta.getCliente().getNomeCliente() + "\n" + "Saldo atual: " + conta.getSaldo());
	}

	public void sacar(Conta conta, double valor) {

		conta.sacar(conta, valor);

		JOptionPane.showMessageDialog(null, "Sacado valor de R$ " + valor + " para "
				+ conta.getCliente().getNomeCliente() + "\n" + "Saldo atual: " + conta.getSaldo());

	}

	public String consultar(Conta conta) {
		StringBuilder stb = new StringBuilder();
		stb.append("Saldo: R$" + conta.getSaldo());
		stb.append("\nLimite R$: " + conta.getLimite());

		return stb.toString();

	}

	public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {

	}

}
