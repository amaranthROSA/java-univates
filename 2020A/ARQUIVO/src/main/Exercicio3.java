package main;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @author amaranth.rosa
 */
public class Exercicio3 {
	public static void main(String[] args) {

		try {
			FileWriter arq = new FileWriter("C:\\temp\\exercicio3.txt");

			for (int i = 1; i <= 99; i++) {
				for (int j = 1; j <= i; j++) {
					arq.write(String.format("%s", i));
				}
				arq.write("\r\n");
			}
			arq.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!");
	}
}
