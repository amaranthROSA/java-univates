package br.univates.samuel.pratica07.sis_banco;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.univates.samuel.pratica07.sis_banco.model.Cliente;
import br.univates.samuel.pratica07.sis_banco.model.Conta;

public class BancoTela {

	static List<Cliente> clientes = new ArrayList<Cliente>();
	static List<Conta> contas = new ArrayList<Conta>();

	// Armazena c�digo do cliente para o sistema
	String codigoCliente;
	String menuOp;
	String op;

	private Conta conta;

	public static void main(String[] args) {
		BancoTela tela = new BancoTela();
		tela.exibir();
	}

	/* Mosta "tela do principal" */
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
			JOptionPane.showMessageDialog(null, "Op��o n�o encontrada.");
			exibir();
			break;
		}
	}

	public void cadastrarCliente() {
		String codigoCliente = JOptionPane.showInputDialog("Informe o c�digo do cliente: ");
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome: ");
		String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
		String endereco = JOptionPane.showInputDialog("Informe o endere�o: ");
		String telefone = JOptionPane.showInputDialog("Informe o telefone: ");

		Cliente cliente = new Cliente.Builder(codigoCliente, nome, sobrenome, cpf).endereco(endereco).telefone(telefone)
				.build();
		clientes.add(cliente);

		/* Mostra informa��es do cliente */
		String info = getInfoCliente(cliente);
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!\n" + info);

		exibir();
	}

	public void cadastrarConta() {
		String codigoCliente = JOptionPane.showInputDialog(null, "Informe o c�digo do cliente: ");

		Cliente cliente = encontrarCliente(codigoCliente);

		if (cliente != null) {
			Conta conta = new Conta.Builder(cliente).build();
			contas.add(conta);

			/* Mostra informa��es da conta */
			String info = getInfoContaCliente(conta);
			JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!\n" + info);

		} else {
			JOptionPane.showMessageDialog(null, "Cliente n�o existe ou c�digo inv�lido!");
		}

		exibir();
	}

	public void operarConta() {
		String codigoCliente = JOptionPane.showInputDialog("Informe o c�digo do cliente: ");

		Conta conta = encontrarConta(codigoCliente);

		if (conta != null) {
			OperaConta operar = new OperaConta(conta);
			operar.exibir();

		} else {
			JOptionPane.showMessageDialog(null, "N�o existe conta cadastrada para o c�digo informado!");
		}

		exibir();
	}

	public String getInfoCliente(Cliente cliente) {
		StringBuilder stb = new StringBuilder();
		stb.append("Nome: " + cliente.getNomeCliente());
		stb.append("\nSobrenome: " + cliente.getSobrenomeCliente());
		stb.append("\nCPF: " + cliente.getCpfCliente());
		stb.append("\nEndere�o: " + cliente.getEnderecoCliente());
		stb.append("\nTelefone: " + cliente.getTelefoneCliente());

		return stb.toString();
	}

	public String getInfoContaCliente(Conta conta) {
		StringBuilder stb = new StringBuilder();
		stb.append("Nome competo: " + conta.getCliente().getNomeCliente() + " "
				+ conta.getCliente().getSobrenomeCliente());
		stb.append("\nC�digo do cliente: " + conta.getCliente().getCodigoCliente());

		return stb.toString();
	}

	/* Retorna Cliente pelo c�digo do cliente */
	public Cliente encontrarCliente(String codigoCliente) {

		for (Cliente cliente : clientes) {
			if (cliente.getCodigoCliente().equals(codigoCliente)) {
				return cliente;
			}
		}

		return null;
	}

	/* Retorna Conta pelo c�digo do cliente */
	public Conta encontrarConta(String codigoCliente) {

		for (Conta conta : contas) {
			if (conta.getCliente().getCodigoCliente().equals(codigoCliente)) {
				return conta;
			}
		}

		return null;
	}

}
