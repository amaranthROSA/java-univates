package main;

import javax.swing.JOptionPane;

import model.Arquivo;

/**
 * @author amaranth.rosa
 */
public class Exercicio5 {
	public static void main(String[] args) {

		String option = "s";

		while (!option.equalsIgnoreCase("n")) {

			Arquivo arq = new Arquivo("C:\\temp\\megasena.csv");
			String linha = "";

			String num1 = JOptionPane.showInputDialog("Informe o número 1: ");
			String num2 = JOptionPane.showInputDialog("Informe o número 2: ");
			String num3 = JOptionPane.showInputDialog("Informe o número 3: ");
			String num4 = JOptionPane.showInputDialog("Informe o número 4: ");
			String num5 = JOptionPane.showInputDialog("Informe o número 5: ");
			String num6 = JOptionPane.showInputDialog("Informe o número 6: ");

			String substring = num1 + ";" + num2 + ";" + num3 + ";" + num4 + ";" + num5 + ";" + num6;

			arq.abrirLeitura();
			linha = arq.lerLinha();

			boolean matchedLine = false;
			String foundLine = "";
			while (linha != null) {
				int match = linha.indexOf(substring);
				if (match != -1) {
					foundLine = linha;
					matchedLine = true;
				}

				linha = arq.lerLinha();
			}

			arq.fecharArquivo();

			if (matchedLine == true) {
				String data = "";
				for (int i = 5; i <= 14; i++) {
					data += foundLine.charAt(i);
				}

				JOptionPane.showMessageDialog(null, "A sequência digitada já foi sorteada: \n\n" + "Data: " + data);
			} else {
				JOptionPane.showMessageDialog(null, "A sequência informada nunca foi sorteada :(");
			}

			option = JOptionPane.showInputDialog("Deseja fazer uma nova tentativa (S/N)?");

		}

	}

}
