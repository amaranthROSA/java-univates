package view;

import javax.swing.JOptionPane;

public class MenuOpcoes {

	public static String selecionarQtSabaoLq() {
		String sabaoLqMl = JOptionPane.showInputDialog("Quantidade de sab�o l�quido: (ml)");

		return sabaoLqMl;
	}

	public static String selecionarQtSabaoPo() {
		String sabaoPoGr = JOptionPane.showInputDialog("Quantidade de sab�o em p�: (gr)");

		return sabaoPoGr;
	}

	public static String selecioarQtRoupa() {
		String roupaKg = JOptionPane.showInputDialog("Quantidade de roupa a lavar: (kg)");

		return roupaKg;
	}
}
