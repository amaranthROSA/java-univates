package view;

import javax.swing.JOptionPane;

import dao.EstacionamentoDAO;
import model.Estacionamento;
import model.Ticket;
import model.Veiculo;
import service.EstacionamentoService;
import service.TicketService;

/**
 * @author amaranth.rosa
 */
public class Tela {

	private static String opcao;
	private static EstacionamentoDAO dao = EstacionamentoDAO.getInstance();

	public static void main(String[] args) {
		menuPrincipal();
	}

	public static void menuPrincipal() {

		setOpcao(JOptionPane
				.showInputDialog("Escolha uma opção:\n\n[1] Entrar no estacionamento" + "\n[2] Sair do estacionamento"
						+ "\n[3] Cadastrar estacionamento" + "\n[4] Estatísticas" + "\n[x] Sair" + "\n\n"));

		switch (getOpcao()) {
		case "1":
			entrarNoEstacionamento();
		case "2":
			sairDoEstacionamento();
		case "3":
			cadastrarEstacionamento();
		case "4":
			mostrarEstatisticas();
		case "x":
			sair();
		default:
			;
		}
	}

	public static void entrarNoEstacionamento() {

		Estacionamento estacionamento = findEstacionamento();

		String horaEntrada = JOptionPane.showInputDialog("Informe a hora de entrada (24hrs): ");
		String placa = JOptionPane.showInputDialog("Informe a placa do veículo: ");

		Ticket ticket = new Ticket(Integer.parseInt(horaEntrada));
		Veiculo veiculo = new Veiculo(placa.toUpperCase(), ticket);

		/*
		 * Faz tentativa de ingressar veículo na praça escolhida
		 */
		if (estacionamento.entrarEstacionamento(veiculo, estacionamento) != true) {
			JOptionPane.showMessageDialog(null, "Estacionamento lotado, escolha outro!");
		} else {
			JOptionPane.showMessageDialog(null, "Veículo estacionado com sucesso.\n\n"
					+ "Memórize o código do seu ticket: " + veiculo.getTicket().getCodigo() + "\n\n");
		}

		menuPrincipal();

	}

	public static void sairDoEstacionamento() {
		TicketService ticketService = TicketService.getIntance();
		EstacionamentoService estacionamentoService = EstacionamentoService.getIntance();

		String codigoTicket = JOptionPane.showInputDialog("Informe o código do ticket: ");
		Veiculo veiculo = ticketService.findVeiculoByTicket(codigoTicket);

		if (veiculo != null) {
			Estacionamento estacionamento = estacionamentoService.findEstacionamentoByVeiculo(veiculo);

			String horaSaida = JOptionPane.showInputDialog("Informe a hora de saída (24hrs): ");
			veiculo.getTicket().setHoraSaida(Integer.parseInt(horaSaida));

			if (estacionamento.sairEstacionamento(veiculo, estacionamento) != true) {
				JOptionPane.showMessageDialog(null, "Saída não autorizada!");
			} else {
				JOptionPane.showMessageDialog(null, "Saída autorizada. Boa viagem!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "O código de ticket informado não é válido.");
		}

		menuPrincipal();
	}

	public static void cadastrarEstacionamento() {
		int option = JOptionPane.showConfirmDialog(null, "Deseja criar um novo estacionamento?");

		if (option == 0) {
			Estacionamento estacionamento = new Estacionamento();

			dao.addEstacionamento(estacionamento);

			JOptionPane.showMessageDialog(null, "Estacionamento criado com sucesso.\n\n" + "Código: "
					+ estacionamento.getCodigo() + "\n" + "Vagas: " + estacionamento.getVagasDisponiveis() + "\n\n");
		} else {
			JOptionPane.showMessageDialog(null, "Operação cancelada.");
		}

		menuPrincipal();
	}

	public static void mostrarEstatisticas() {

		int totalArrecadado = dao.getTotalValorArrecadado();
		int veiculosEstacionados = dao.getVeiculoEstacionados();
		int veiculosTotal = dao.getquantidadeVeiculosTotalDia();

		JOptionPane.showMessageDialog(null, "Estatísticas: \n\n" + "Veiculos estacionados: " + veiculosEstacionados
				+ "\nVeiculos no dia: " + veiculosTotal + "\nTotal arrecadado: R$ " + totalArrecadado + "\n\n");

		menuPrincipal();

	}

	public static void sair() {
		System.exit(0);
	}

	/*
	 * Encontra e retorna um estacionamento
	 */
	public static Estacionamento findEstacionamento() {
		String numeroEstacionamento = JOptionPane
				.showInputDialog("Informe o número do estacionamento: \n\n" + dao.getEstacionamentos());

		Estacionamento estacionamento = dao.findEstacionamento(Integer.parseInt(numeroEstacionamento));

		while (estacionamento == null) {
			JOptionPane.showMessageDialog(null, "Estacionamento não encontrado!");

			numeroEstacionamento = JOptionPane
					.showInputDialog("Informe o código do estacionamento: \n\n" + dao.getEstacionamentos());
			estacionamento = dao.findEstacionamento(Integer.parseInt(numeroEstacionamento));
		}

		return estacionamento;
	}

	public static String getOpcao() {
		return opcao;
	}

	public static void setOpcao(String opcao) {
		Tela.opcao = opcao;
	}

}
