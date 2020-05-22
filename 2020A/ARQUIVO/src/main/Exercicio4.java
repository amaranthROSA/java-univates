package main;

import javax.swing.JOptionPane;

import model.Arquivo;

/**
 * @author amaranth.rosa
 */
public class Exercicio4 {
	public static void main(String[] args) {

		Arquivo arq = new Arquivo("C:\\temp\\exercicio4.txt");

		arq.abrirEscrita();

		String saida = "";
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				saida += (i + "x" + j + "=" + i * j + "  ");
			}
			saida += "\r\n";
		}

		arq.escreverLinha(saida);
		arq.fecharArquivo();

		JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!");

	}
}
