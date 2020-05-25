package service;

import dao.EstacionamentoDAO;
import model.Estacionamento;
import model.Veiculo;

/**
 * @author amaranth.rosa
 */
public class TicketService {

	private static TicketService INSTANCE;

	private static EstacionamentoDAO dao = EstacionamentoDAO.getInstance();

	public TicketService() {

	}

	/*
	 * Encontra um veículo informando o código único do ticket
	 */
	public Veiculo findVeiculoByTicket(String codigoTicket) {

		for (Estacionamento estacionamento : dao.getEstacionamentos()) {
			for (Veiculo veiculo : estacionamento.getVeiculos()) {
				if (veiculo.getTicket().getCodigo().equals(codigoTicket))
					return veiculo;
			}
		}

		return null;
	}

	public static TicketService getIntance() {
		if (INSTANCE == null)
			INSTANCE = new TicketService();

		return INSTANCE;
	}

}
