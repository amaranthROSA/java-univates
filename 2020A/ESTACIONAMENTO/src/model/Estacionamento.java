package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dao.EstacionamentoDAO;

/**
 * @author amaranth.rosa
 */
public class Estacionamento {

	private static int TARIFA_BASE = 3;

	private static List<Veiculo> veiculos = new ArrayList<Veiculo>();

	private int numeroEstacionamento;
	private int quantidadeVeiculosTotalDia;
	private int quantidadeVeiculosEstacionados;
	private int valorArrecadado;

	private static EstacionamentoDAO dao = EstacionamentoDAO.getInstance();

	/*
	 * Método que processa entrada de veículo no estacionamento
	 */
	public void entrar(Veiculo veiculo, int numeroEstacionamento) {

		while (dao.findEstacionamento(numeroEstacionamento) == null) {
			JOptionPane.showMessageDialog(null, "Estacionamento não encontrado!");
		}

		Estacionamento estacionamento = dao.findEstacionamento(numeroEstacionamento);
		estacionamento.addVeiculo(veiculo);

		quantidadeVeiculosTotalDia++;
		quantidadeVeiculosEstacionados++;
	}

	/*
	 * Método que processa saída de veícuo do estacionamento
	 */
	public void sair(Veiculo veiculo, Estacionamento estacionamento, int horaSaida) {
		veiculo.getTicket().setHoraSaida(horaSaida);

		JOptionPane.showConfirmDialog(null, "Sua tarifa é de R$ " + getTarifaTotal(veiculo));

		while (veiculo.isTarifaPaga() != true) {
			JOptionPane.showMessageDialog(null, "Saída não autorizada, pague a tarifa!");
		}

		veiculo.setIsTarifaPaga(true);

		quantidadeVeiculosEstacionados--;
	}

	/*
	 * Retorna valor valor da tarifa-base multiplicado pelo número de horas
	 */
	public int getTarifaTotal(Veiculo veiculo) {
		return TARIFA_BASE * (veiculo.getTicket().getHoraEntrada() - veiculo.getTicket().getHoraSaida());
	}

	/* MÉTODOS AUXILIARES */

	/*
	 * Introduz um carro no estacionamento
	 */
	public void addVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}

	/*
	 * Introduz o valor arrecadado de uma tarifa paga
	 */
	public void addValorTarifa(int valorTarifa) {
		this.valorArrecadado += valorTarifa;
	}

	/* GETTERS AND SETTERS */

	public int getQuantidadeVeiculosTotalDia() {
		return quantidadeVeiculosTotalDia;
	}

	public int getQuantidadeVeiculosEstacionados() {
		return quantidadeVeiculosEstacionados;
	}

	public int getValorArrecadado() {
		return valorArrecadado;
	}

	public int getNumeroEstacionamento() {
		return numeroEstacionamento;
	}

	public void setNumeroEstacionamento(int numeroEstacionamento) {
		this.numeroEstacionamento = numeroEstacionamento;
	}

}
