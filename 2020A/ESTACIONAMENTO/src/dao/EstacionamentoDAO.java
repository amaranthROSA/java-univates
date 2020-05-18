package dao;

import java.util.ArrayList;
import java.util.List;

import model.Estacionamento;

/**
 * @author amaranth.rosa
 */
public class EstacionamentoDAO {

	private static EstacionamentoDAO INSTANCE;

	private static List<Estacionamento> estacionamentos = new ArrayList<Estacionamento>();

	public List<Estacionamento> getEstacionamentos() {
		return estacionamentos;
	}

	/*
	 * Adiciona uma nova pra�a de estacionamento
	 */
	public void addEstacionamento(Estacionamento estacionamento) {
		estacionamentos.add(estacionamento);
	}

	/*
	 * Encontra um estacionamento informando o n�mero
	 */
	public Estacionamento findEstacionamento(int numeroEstacionamento) {
		for (Estacionamento estc : getEstacionamentos()) {
			if (estc.getNumeroEstacionamento() == numeroEstacionamento)
				return estc;
		}

		return null;
	}

	/*
	 * Retorna total de ve�culos estacionados em todas as pra�as
	 */
	public int getTotalVeiculoEstacionados() {
		int total = 0;

		for (Estacionamento estacionamento : getEstacionamentos()) {
			total += estacionamento.getQuantidadeVeiculosEstacionados();
		}

		return total;
	}

	/*
	 * Retorna valor arrecadado em todas as pra�as
	 */
	public int getTotalValorArrecadado() {
		int total = 0;

		for (Estacionamento estacionamento : getEstacionamentos()) {
			total += estacionamento.getValorArrecadado();
		}

		return total;
	}

	/*
	 * Singleton
	 */
	public static EstacionamentoDAO getInstance() {
		if (INSTANCE == null)
			INSTANCE = new EstacionamentoDAO();

		return INSTANCE;
	}
}
