package view;

import javax.swing.JOptionPane;

import enums.MenuPrincipalEnum;

/**
 * @author amaranth.rosa
 */
public class Menus {

	public static MenuPrincipalEnum menuPrincipal() {
		String op = JOptionPane.showInputDialog("Escolha uma opção:\n\n" + "[1] Retirar livro\n"
				+ "[2] Devolver livro\n" + "[3] Cadastrar leitor\n" + "[4] Cadastrar livro" + "\n\n");

		if (op.equals("1"))
			return MenuPrincipalEnum.RETIRAR_LIVRO;

		else if (op.equals("2"))
			return MenuPrincipalEnum.DEVOLVER_LIVRO;

		else if (op.equals("3"))
			return MenuPrincipalEnum.CADASTRAR_LEITOR;

		else if (op.equals("4"))
			return MenuPrincipalEnum.CADASTRAR_LIVRO;

		else {
			return MenuPrincipalEnum.OPCAO_INVALIDA;
		}
	}

	public static void retirarLivro() {
		System.out.println("Retirando livro...");
	}

	public static void devolverLivro() {
		System.out.println("Devolvendo livro...");
	}

	public static void cadastrarLeitor() {
		System.out.println("Cadastrando leitor...");
	}

	public static void cadastrarLivro() {
		System.out.println("Cadastrando livro...");
	}

	public static void opcaoInvalida() {
		JOptionPane.showMessageDialog(null, "Escolha uma opção válida!");
	}

}
