package br.univates.samuel.pratica07.sis_banco;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.univates.samuel.pratica07.sis_banco.model.Cliente;
import br.univates.samuel.pratica07.sis_banco.model.ContaCorrente;

public class BancoTela {

	List<Cliente> clientes = new ArrayList<Cliente>();
	List<ContaCorrente> contas = new ArrayList<ContaCorrente>();

	public void exibir() {
		String op = JOptionPane.showInputDialog("MENU\n\n" + "[1] Cadastrar cliente\n" + "[2] Cadastrar conta\n"
				+ "[3] Operar conta\n" + "[x] Sair do sistema");
		char opcao = op.charAt(0);

		/* Realiza cadastro do cliente */
		if (op.equals("1")) {
			String codigo = JOptionPane.showInputDialog("Informe o código: ");
			String nome = JOptionPane.showInputDialog("Informe o nome: ");
			String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome: ");
			String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
			String endereco = JOptionPane.showInputDialog("Informe o endereço: ");
			String telefone = JOptionPane.showInputDialog("Informe o telefone: ");

			Cliente cliente = new Cliente.Builder(codigo, nome, sobrenome, cpf).endereco(endereco).telefone(telefone)
					.build();

			clientes.add(cliente);

			exibir();
		}

		/* Realiza cadastro da conta */
		else if (op.equals("2")) {
			String codigoCliente = JOptionPane.showInputDialog("Informe o código do cliente: ");

			for (Cliente cliente : clientes) {
				if (cliente.getCodigoCliente().equals(codigoCliente)) {

					ContaCorrente conta = new ContaCorrente.Builder(cliente).build();
					contas.add(conta);
				} else {
					JOptionPane.showMessageDialog(null, "Código de cliente não é válido.");
				}

			}

			exibir();

			/* Realiza operações na conta */
		} else if (op.equals("3")) {
			String codigoCliente = JOptionPane.showInputDialog("Informe o código do cliente: ");

			for (ContaCorrente conta : contas) {
				if (conta.getCliente().getCodigoCliente().equals(Long.valueOf(codigoCliente))) {
					String opt = JOptionPane
							.showInputDialog("MENU\n\n" + "[1] Depositar\n" + "[2] Sacar\n" + "[x] Sair");

					if (opt.equals("1")) {
						String valor = JOptionPane.showInputDialog("Informe o valor a depositar");

						conta.depositar(Double.parseDouble(valor));

					} else if (opt.equals("2")) {

						String valor = JOptionPane.showInputDialog("Informe o valor a sacar");

						conta.sacar(Double.parseDouble(valor));

					} else if (opt.equals("x")) {
						JOptionPane.showMessageDialog(null, "Encerrando operações na conta.");
					}

					else {
						JOptionPane.showMessageDialog(null, "Opção não encontrada.");
					}

				}
			}

			exibir();
		}

		else if (op.equals("x")) {
			JOptionPane.showMessageDialog(null, "Encerrando sistema...");
		}

		else {
			JOptionPane.showMessageDialog(null, "Opção não encontrada.");

			exibir();
		}

	}
}
