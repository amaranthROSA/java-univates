package main;

import javax.swing.JOptionPane;

import model.Arquivo;

/**
 * @author amaranth.rosa
 */
public class Exercicio1 {
	public static void main(String[] args) {

		Arquivo arq = new Arquivo("C:\\temp\\exercicio1.txt");
		arq.abrirEscrita();

		String option = "s";
		while (!option.equalsIgnoreCase("n")) {

			String nome = JOptionPane.showInputDialog("Informe seu nome:");
			arq.escreverLinha(nome + ";");
			String telefone = JOptionPane.showInputDialog("Informe o telefone: ");
			arq.escreverLinha(telefone + ";");
			String email = JOptionPane.showInputDialog("Informe o e-mail: ");
			arq.escreverLinha(email + ";");

			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso.");

			option = JOptionPane.showInputDialog("Deseja fazer uma nova tentativa (S/N)?");

		}
		arq.fecharArquivo();

	}
}
