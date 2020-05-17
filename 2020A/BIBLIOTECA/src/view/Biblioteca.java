package view;

import enums.MenuPrincipalType;

/**
 * @author amaranth.rosa
 */
public class Biblioteca {

	private static MenuPrincipalType menu;

	public MenuPrincipalType telaPrincipal() {

		setMenu(Menus.menuPrincipal());

		if (getMenu().equals(MenuPrincipalType.RETIRAR_LIVRO))
			Menus.retirarLivro();

		else if (getMenu().equals(MenuPrincipalType.DEVOLVER_LIVRO))
			Menus.devolverLivro();

		else if (getMenu().equals(MenuPrincipalType.CADASTRAR_LEITOR))
			Menus.cadastrarLeitor();

		else if (getMenu().equals(MenuPrincipalType.CADASTRAR_LIVRO))
			Menus.cadastrarLivro();

		return getMenu();

	}

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();

		biblioteca.telaPrincipal();

		while (getMenu().equals(MenuPrincipalType.OPCAO_INVALIDA)) {

			Menus.opcaoInvalida();
			setMenu(biblioteca.telaPrincipal());

		}

	}

	public static MenuPrincipalType getMenu() {
		return menu;
	}

	public static void setMenu(MenuPrincipalType menu) {
		Biblioteca.menu = menu;
	}

}
