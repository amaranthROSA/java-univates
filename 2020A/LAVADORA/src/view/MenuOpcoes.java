package view;

import javax.swing.JOptionPane;

public class MenuOpcoes {

	public static String selecionarQtSabaoLq() {
		String sabaoLqMl = JOptionPane.showInputDialog("Quantidade de sab�o l�quido (0ml - 25ml):");

		return sabaoLqMl;
	}

	public static String selecionarQtSabaoPo() {
		String sabaoPoGr = JOptionPane.showInputDialog("Quantidade de sab�o em p� (0gr - 50gr):");

		return sabaoPoGr;
	}

	public static String selecioarQtRoupa() {
		String roupaKg = JOptionPane.showInputDialog("Quantidade de roupa a lavar (0kg - 10kg)");

		return roupaKg;
	}
}
