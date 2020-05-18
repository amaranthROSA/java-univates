package view;

import javax.swing.JOptionPane;

import dao.EstacionamentoDAO;
import model.Estacionamento;

/**
 * @author amaranth.rosa
 */
public class Tela {

	private static String opcao;
	private static EstacionamentoDAO dao = EstacionamentoDAO.getInstance();

	public static void main(String[] args) {
		criarEstacionamentos();

		setOpcao(JOptionPane
				.showInputDialog("Escolha uma opção:\n\n[1] Estacionar veículo" + "\n[2] Sair do estacionamento\n\n"));

		switch (getOpcao()) {
		case "1":
			;
		case "2":
			;
		default:
			;
		}
	}

	public static void criarEstacionamentos() {
		Estacionamento estacionamento1 = new Estacionamento();

		dao.addEstacionamento(estacionamento1);
	}

	public static String getOpcao() {
		return opcao;
	}

	public static void setOpcao(String opcao) {
		Tela.opcao = opcao;
	}

}
