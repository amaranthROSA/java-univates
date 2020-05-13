package view;

import enums.MenuPrincipalEnum;

/**
 * @author amaranth.rosa
 */
public class Biblioteca {

	public MenuPrincipalEnum telaPrincipal() {

		MenuPrincipalEnum menuP = Menus.menuPrincipal();

		if (menuP.equals(MenuPrincipalEnum.RETIRAR_LIVRO))
			Menus.retirarLivro();

		else if (menuP.equals(MenuPrincipalEnum.DEVOLVER_LIVRO))
			Menus.devolverLivro();

		else if (menuP.equals(MenuPrincipalEnum.CADASTRAR_LEITOR))
			Menus.cadastrarLeitor();

		else if (menuP.equals(MenuPrincipalEnum.CADASTRAR_LIVRO))
			Menus.cadastrarLivro();

		return menuP;

	}

	public static void main(String[] args) {

		MenuPrincipalEnum menuP = MenuPrincipalEnum.OPCAO_INVALIDA;

		Biblioteca biblioteca = new Biblioteca();

		menuP = biblioteca.telaPrincipal();

		while (menuP.equals(MenuPrincipalEnum.OPCAO_INVALIDA)) {

			Menus.opcaoInvalida();
			menuP = biblioteca.telaPrincipal();

		}

	}

}
