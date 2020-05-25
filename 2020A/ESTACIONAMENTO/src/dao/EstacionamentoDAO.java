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

	public void addEstacionamento(Estacionamento estacionamento) {
		estacionamentos.add(estacionamento);
	}

	/*
	 * Encontra um estacionamento informando o número
	 */
	public Estacionamento findEstacionamento(int numeroEstacionamento) {
		for (Estacionamento estacionamento : getEstacionamentos()) {
			if (estacionamento.getCodigo() == numeroEstacionamento)
				return estacionamento;
		}

		return null;
	}

	/*
	 * Retorna total de veículos estacionados em todas as praças
	 */
	public int getVeiculoEstacionados() {
		int total = 0;

		for (Estacionamento estacionamento : getEstacionamentos()) {
			total += estacionamento.getQuantidadeVeiculosEstacionados();
		}

		return total;
	}

	/*
	 * Retorna valor arrecadado em todas as praças
	 */
	public int getTotalValorArrecadado() {
		int total = 0;

		for (Estacionamento estacionamento : getEstacionamentos()) {
			total += estacionamento.getValorArrecadado();
		}

		return total;
	}

	public int getquantidadeVeiculosTotalDia() {
		return Estacionamento.quantidadeVeiculosTotalDia;
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
