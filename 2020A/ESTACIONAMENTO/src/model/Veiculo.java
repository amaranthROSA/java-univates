package model;

/**
 * @author amaranth.rosa
 */
public class Veiculo {

	private Ticket ticket;

	private int numeroVeiculo;
	private boolean tarifaPaga = false;

	public Veiculo(Ticket ticket) {
		setTicket(ticket);
	}

	/* GETTERS AND SETTERS */

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public boolean isTarifaPaga() {
		return tarifaPaga;
	}

	public void setIsTarifaPaga(boolean tarifaPaga) {
		this.tarifaPaga = tarifaPaga;
	}

	public int getNumeroVeiculo() {
		return numeroVeiculo;
	}

	public void setNumeroVeiculo(int numeroVeiculo) {
		this.numeroVeiculo = numeroVeiculo;
	}

}
