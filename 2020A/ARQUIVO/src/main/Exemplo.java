package main;

import javax.swing.JOptionPane;

import model.Arquivo;

/**
 * @author amaranth.rosa
 */
public class Exemplo {
	public static void main(String[] args) {
//		criarArquivo();
		lerArquivo();
	}

	public static void criarArquivo() {
		Arquivo arq = new Arquivo("C:\\temp\\exemplo.txt");
		String linha = "";
		String texto = "";

		arq.abrirEscrita();
		arq.escreverLinha("linha 1 - teste");
		arq.escreverLinha("linha 2 - teste");
		arq.escreverLinha("linha 3 - teste");
		arq.escreverLinha("linha 4 - teste");

		arq.fecharArquivo();

		JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!");

		System.exit(0);
	}

	public static void lerArquivo() {
		Arquivo arq = new Arquivo("C:\\temp\\exemplo.txt");
		String linha = "";
		String texto = "";

		arq.abrirLeitura();

		linha = arq.lerLinha();
		while (linha != null) {
			texto += linha + "\n";
			linha = arq.lerLinha();
		}

		arq.fecharArquivo();

		System.out.println(texto);
	}
}
