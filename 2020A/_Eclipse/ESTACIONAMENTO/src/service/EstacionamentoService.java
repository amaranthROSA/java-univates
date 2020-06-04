package service;

import dao.EstacionamentoDAO;
import model.Estacionamento;
import model.Veiculo;

/**
 * @author amaranth.rosa
 */
public class EstacionamentoService {

	private static EstacionamentoService INSTANCE;

	private static EstacionamentoDAO dao = EstacionamentoDAO.getInstance();

	/*
	 * Encontra um estacionamneto informando o veículo
	 */
	public Estacionamento findEstacionamentoByVeiculo(Veiculo veiculo) {

		for (Estacionamento est : dao.getEstacionamentos()) {
			for (Veiculo vl : est.getVeiculos()) {
				if (vl.equals(veiculo)) {
					return est;
				}
			}
		}

		return null;
	}

	public static EstacionamentoService getIntance() {
		if (INSTANCE == null)
			INSTANCE = new EstacionamentoService();

		return INSTANCE;
	}

}
