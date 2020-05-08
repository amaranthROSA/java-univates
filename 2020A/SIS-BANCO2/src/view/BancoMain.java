package view;

import javax.swing.JOptionPane;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import dao.ClientesDAO;
import dao.ContasDAO;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 * @author amaranth.rosa
 */
public class BancoMain {

	String codigoCliente;
	String menuOp;
	String op;

	private Conta conta;

	public static void main(String[] args) {
		BancoMain tela = new BancoMain();
		tela.exibir();
	}

	/* ----- MOSTRA TELA PRINCIPAL ----- */
	public void exibir() {

		menuOp = JOptionPane.showInputDialog("MENU\n\n" + "[1] Cadastrar cliente\n" + "[2] Cadastrar conta\n"
				+ "[3] Operar conta\n" + "[x] Sair do sistema\n\n");

		switch (menuOp) {
		case "1":
			cadastrarCliente();
			break;
		case "2":
			cadastrarConta();
			break;
		case "3":
			operarConta();
			break;
		case "x":
			System.out.println("Sistema encerrado.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada.");
			exibir();
			break;
		}
	}

	public void cadastrarCliente() {
		Cliente cliente = new Cliente();

		String codigoCliente = JOptionPane.showInputDialog("Informe o código do cliente: ");
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome: ");
		String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
		String endereco = JOptionPane.showInputDialog("Informe o endereço: ");
		String telefone = JOptionPane.showInputDialog("Informe o telefone: ");

		try {

			cliente = new Cliente(Long.parseLong(codigoCliente), nome, sobrenome, cpf, endereco, telefone);

		} catch (ParseException pse) {
			pse.printStackTrace();
		}

		/* ----- ADD CLIENTE USANDO DAO ----- */
		ClientesDAO dao = new ClientesDAO();
		dao.createCliente(cliente);

		/* ----- MOSTRA INFO DO CLIENTE ----- */
		String info = getInfoCliente(cliente);
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!\n" + info);

		exibir();
	}

	public void cadastrarConta() {
		String tipoConta = "";
		String msgCreate = new String("Informe tipo de conta a ser criada:\n\n" + "[P] Poupança\n" + "[C] Corrente\n");
		String codigoCliente = JOptionPane.showInputDialog(null, "Informe o código do cliente: ");

		Cliente cliente = new Cliente();
		ClientesDAO daoCliente = new ClientesDAO();

		try {
			cliente = daoCliente.encontrarCliente(Long.parseLong(codigoCliente));
		} catch (ParseException pse) {
			pse.printStackTrace();
		}

		/* VERIFICA QUE TIPO DE SERA CRIADA */
		tipoConta = JOptionPane.showInputDialog(msgCreate);

		if (!tipoConta.equalsIgnoreCase("p") && !tipoConta.equalsIgnoreCase("c")) {

			tipoConta = JOptionPane.showInputDialog(msgCreate);
		} else {

			/* ----- CRIA CONTA POUPANCA ----- */
			if (tipoConta.equalsIgnoreCase("p")) {
				if (cliente != null) {
					ContaPoupanca conta = new ContaPoupanca(cliente);
					ContasDAO daoConta = new ContasDAO();

					daoConta.createConta(conta);

					/* MOSTRA INFO DA CONTA */
					String info = getInfoContaCliente(conta);
					JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!\n" + info);

				} else {
					JOptionPane.showMessageDialog(null, "Cliente não existe ou código inválido!");
				}
			}

			/* ---- CRIA CONTA CORRENTE ----- */
			if (tipoConta.equalsIgnoreCase("c")) {
				if (cliente != null) {
					ContaCorrente conta = new ContaCorrente(cliente);
					ContasDAO dao = new ContasDAO();

					dao.createConta(conta);

					/* MOSTRA INFO DA CONTA */
					String info = getInfoContaCliente(conta);
					JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!\n" + info);

				} else {
					JOptionPane.showMessageDialog(null, "Cliente não existe ou código inválido!");
				}
			}
		}
		exibir();
	}

	public void operarConta() {
		String codigoCliente = JOptionPane.showInputDialog("Informe o código do cliente: ");
		Conta conta = new Conta();
		ContasDAO dao = new ContasDAO();

		try {
			conta = dao.encontrarConta(Long.parseLong(codigoCliente));
		} catch (ParseException pse) {
			pse.printStackTrace();
		}

		if (conta != null) {
			OperaConta operar = new OperaConta(conta);
			operar.exibir();

		} else {
			JOptionPane.showMessageDialog(null, "Não existe conta cadastrada para o código informado!");
		}

		exibir();
	}

	public String getInfoCliente(Cliente cliente) {
		StringBuilder stb = new StringBuilder();
		stb.append("Nome: " + cliente.getNome());
		stb.append("\nSobrenome: " + cliente.getSobrenome());
		stb.append("\nCPF: " + cliente.getCpf());
		stb.append("\nEndereço: " + cliente.getEndereco());
		stb.append("\nTelefone: " + cliente.getTelefone());

		return stb.toString();
	}

	public String getInfoContaCliente(Conta conta) {
		StringBuilder stb = new StringBuilder();
		stb.append("Nome competo: " + conta.getCliente().getNome() + " " + conta.getCliente().getSobrenome());
		stb.append("\nCódigo do cliente: " + conta.getCliente().getCodigo());

		return stb.toString();
	}

}
