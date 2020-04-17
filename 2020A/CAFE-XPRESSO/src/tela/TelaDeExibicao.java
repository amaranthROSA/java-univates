/**
 * 
 */
package tela;

import javax.swing.JOptionPane;

/**
 * @author amaranth.rosa
 *
 */
public class TelaDeExibicao {

	static String opt;
	static MenuDeOpcoes menu = new MenuDeOpcoes();

	public static void main(String[] args) {
		principal();

		switch (opt) {
		case "1":
			chamarMenu();
			break;
		case "2":
			chamarManutencao();
			break;
		case "x":
			encerrar();
		default:
			JOptionPane.showMessageDialog(null, "Op��o escolhida n�o � v�lida.");
			principal();
			break;
		}
	}

	public static void principal() {
		opt = JOptionPane.showInputDialog("Escolha umas das op��es abaixo:\n\n" + "[1] Preparar bebida\n"
				+ "[2] Realizar manuten��o\n" + "[x] Sair\n\n");
	}

	public static void chamarMenu() {
		menu.exibir();
	}

	public static void chamarManutencao() {
		menu.manutencao();

	}

	public static void encerrar() {
		System.out.println("Encerrando sistema...");
		System.exit(0);
	}
}
