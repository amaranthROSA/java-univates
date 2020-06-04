package model;

/**
 * @author amaranth.rosa
 */
public class Veiculo {

	private String placa;
	private Ticket ticket;

	public Veiculo(String placa, Ticket ticket) {
		setPlaca(placa);
		setTicket(ticket);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}
