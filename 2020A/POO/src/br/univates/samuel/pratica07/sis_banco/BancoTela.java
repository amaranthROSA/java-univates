package br.univates.samuel.pratica07.sis_banco;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.univates.samuel.pratica07.sis_banco.model.Cliente;
import br.univates.samuel.pratica07.sis_banco.model.ContaCorrente;

public class BancoTela {

	List<Cliente> clientes = new ArrayList<Cliente>();
	List<ContaCorrente> contas = new ArrayList<ContaCorrente>();

	// Armazena c�digo do cliente para o sistema
	String codigoCliente;
	String menuOp;

	/* Tela do menu */
	public void menu() {

		menuOp = JOptionPane.showInputDialog("MENU\n\n" + "[1] Cadastrar cliente\n" + "[2] Cadastrar conta\n"
				+ "[3] Operar conta\n" + "[x] Sair do sistema\n\n");
	}

	public void exibir() {
		menu();

		if (menuOp.equals("x")) {
			System.out.println("Sistema encerrado.");

		} else {

			this.codigoCliente = JOptionPane.showInputDialog("Informe o c�digo do cliente: ");

			if (menuOp.equals("1")) {
				cadastrarCliente();
			}

			else if (menuOp.equals("2")) {
				cadastrarConta();

			} else if (menuOp.equals("3")) {
				operarConta();
			}

			else {
				JOptionPane.showMessageDialog(null, "Op��o n�o encontrada.");

				// Retorna para tela principal
				exibir();
			}
		}
	}

	/* Realiza cadastro do cliente */
	public void cadastrarCliente() {
		String codigo = this.codigoCliente;
		String nome = JOptionPane.showInputDialog("Informe o nome: ");
		String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome: ");
		String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
		String endereco = JOptionPane.showInputDialog("Informe o endere�o: ");
		String telefone = JOptionPane.showInputDialog("Informe o telefone: ");

		Cliente cliente = new Cliente.Builder(codigo, nome, sobrenome, cpf).endereco(endereco).telefone(telefone)
				.build();

		clientes.add(cliente);

		// Retorna para tela principal
		exibir();
	}

	/* Realiza cadastro da conta */
	public void cadastrarConta() {
		for (Cliente cliente : clientes) {
			if (cliente.getCodigoCliente().equals(codigoCliente)) {

				ContaCorrente conta = new ContaCorrente.Builder(cliente).build();
				contas.add(conta);
			} else {
				JOptionPane.showMessageDialog(null, "C�digo de cliente n�o � v�lido.");
			}
		}

		// Retorna para tela principal
		exibir();
	}

	/* Realiza opera��es na conta */
	public void operarConta() {

		for (ContaCorrente conta : contas) {

			/* Avisa caso n�o encontrar cliente */
			if (!(conta.getCliente().getCodigoCliente().equals(codigoCliente))) {

				JOptionPane.showMessageDialog(null, "Cliente n�o encontrado!");

			} else {
				String opt = JOptionPane
						.showInputDialog("MENU\n\n" + "[1] Depositar\n" + "[2] Sacar\n" + "[3] Saldo\n" + "[x] Sair");

				if (opt.equals("1")) {
					String valor = JOptionPane.showInputDialog("Informe o valor a depositar");

					conta.depositar(Double.parseDouble(valor));

					JOptionPane.showMessageDialog(null, "Depositado valor de R$ " + valor + " para "
							+ conta.getCliente().getNomeCliente() + "\n" + "Saldo atual: " + conta.getSaldo());

				} else if (opt.equals("2")) {

					String valor = JOptionPane.showInputDialog("Informe o valor a sacar");

					conta.sacar(Double.parseDouble(valor));

					JOptionPane.showMessageDialog(null, "Sacado valor de R$ " + valor + " para "
							+ conta.getCliente().getNomeCliente() + "\n" + "Saldo atual: " + conta.getSaldo());

				} else if (opt.contentEquals("3")) {
					JOptionPane.showMessageDialog(null, "Saldo para cliente " + conta.getCliente().getNomeCliente()
							+ " � de:\n" + "R$ " + conta.getSaldo());
				}

				else if (opt.equals("x")) {
					JOptionPane.showMessageDialog(null, "Encerrando opera��es na conta.");
				}

				else {
					JOptionPane.showMessageDialog(null, "Op��o n�o encontrada.");
				}
			}

		}

		// Retorna para tela principal
		exibir();
	}

}
