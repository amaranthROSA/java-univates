package view;

import javax.swing.JOptionPane;

public class MenuOpcoes {

	public static String selecionarQtSabaoLq() {
		String sabaoLqMl = JOptionPane.showInputDialog("Quantidade de sabão líquido: (ml)");

		return sabaoLqMl;
	}

	public static String selecionarQtSabaoPo() {
		String sabaoPoGr = JOptionPane.showInputDialog("Quantidade de sabão em pó: (gr)");

		return sabaoPoGr;
	}

	public static String selecioarQtRoupa() {
		String roupaKg = JOptionPane.showInputDialog("Quantidade de roupa a lavar: (kg)");

		return roupaKg;
	}
}
