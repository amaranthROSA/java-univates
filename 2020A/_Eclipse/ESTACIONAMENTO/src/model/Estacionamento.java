package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dao.EstacionamentoDAO;

/**
 * @author amaranth.rosa
 */
public class Estacionamento {

	private static int sequencia = 0;
	public static int quantidadeVeiculosTotalDia;

	private int codigo;
	private int quantidadeVeiculosEstacionados;
	private int quantidadeVagasDisponiveis;
	private int valorArrecadado;

	private static List<Veiculo> veiculos = new ArrayList<Veiculo>();

	private static EstacionamentoDAO dao = EstacionamentoDAO.getInstance();

	public Estacionamento() {
		incrementarSequencia();
		setCodigo(sequencia);
		setQuantidadeVagasDisponiveis(15);
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	/*
	 * M�todo que processa entrada de ve�culo no estacionamento
	 */
	public boolean entrarEstacionamento(Veiculo veiculo, Estacionamento estacionamento) {
		estacionamento.addVeiculo(veiculo);

		if (getQuantidadeVagasDisponiveis() <= 0) {

			return false;
		} else {
			estacionamento.incrementarQuantidadeVeiculosEstacionados();
			estacionamento.incrementarQuantidadeVeiculosTotalDia();
			estacionamento.decrementarQuantidadeVagasDisponiveis();

			return true;
		}
	}

	/*
	 * M�todo que processa sa�da de ve�cuo do estacionamento
	 */
	public boolean sairEstacionamento(Veiculo veiculo, Estacionamento estacionamento) {

		while (JOptionPane.showConfirmDialog(null,
				"Sua tarifa � de R$ " + veiculo.getTicket().getTarifaTotal() + "\n Deseja pagar?\n\n") != 0) {

			JOptionPane.showMessageDialog(null, "Sa�da n�o autorizada, pague a tarifa!");

		}

		veiculo.getTicket().setTarifaPaga(true);

		if (veiculo.getTicket().isTarifaPaga() == true) {
			estacionamento.addValorTarifa(veiculo.getTicket().getTarifaTotal());
			estacionamento.removeVeiculo(veiculo);

			estacionamento.decrementarQuantidadeVeiculosEstacionados();
			estacionamento.incrementarQuantidadeVagasDisponiveis();

			return true;

		}

		return false;

	}

	/*
	 * Informa quantas vagas dispon�veis h�
	 */
	public int getVagasDisponiveis() {
		return (getQuantidadeVagasDisponiveis() - getQuantidadeVeiculosEstacionados());
	}

	public void setQuantidadeVagasDisponiveis(int quantidadeVagasDisponiveis) {
		this.quantidadeVagasDisponiveis = quantidadeVagasDisponiveis;
	}

	/*
	 * Adiciona ve�culo ao estacionamento
	 */
	public void addVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}

	/*
	 * Retira ve�culo do estacionamento
	 */
	public void removeVeiculo(Veiculo veiculo) {
		veiculos.remove(veiculo);
	}

	public void addValorTarifa(int valorTarifa) {
		this.valorArrecadado += valorTarifa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public static void incrementarSequencia() {
		sequencia++;
	}

	public void incrementarQuantidadeVeiculosEstacionados() {
		quantidadeVeiculosEstacionados++;
	}

	public void decrementarQuantidadeVeiculosEstacionados() {
		quantidadeVeiculosEstacionados--;
	}

	public int getQuantidadeVeiculosEstacionados() {
		return quantidadeVeiculosEstacionados;
	}

	public void incrementarQuantidadeVagasDisponiveis() {
		quantidadeVagasDisponiveis++;
	}

	public void decrementarQuantidadeVagasDisponiveis() {
		quantidadeVagasDisponiveis--;
	}

	public int getQuantidadeVagasDisponiveis() {
		return quantidadeVagasDisponiveis;
	}

	public void incrementarQuantidadeVeiculosTotalDia() {
		quantidadeVeiculosTotalDia++;
	}

	public int getQuantidadeVeiculosTotalDia() {
		return quantidadeVeiculosTotalDia;
	}

	public int getValorArrecadado() {
		return valorArrecadado;
	}

	@Override
	public String toString() {
		return "C�digo: " + codigo + ", vagas dispon�veis: " + quantidadeVagasDisponiveis;
	}

}
