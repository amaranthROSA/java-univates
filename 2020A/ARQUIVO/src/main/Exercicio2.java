package main;

import javax.swing.JOptionPane;

import model.Arquivo;

/**
 * @author amaranth.rosa
 */
public class Exercicio2 {
	public static void main(String[] args) {

		Arquivo arq = new Arquivo("C:\\temp\\exercicio1.txt");
		String linha = "";
		String saida = "";

		arq.abrirLeitura();

		linha = arq.lerLinha();
		while (linha != null) {
			saida += linha + "\n";
			linha = arq.lerLinha();
		}

		arq.fecharArquivo();

		JOptionPane.showMessageDialog(null, saida);

	}
}
