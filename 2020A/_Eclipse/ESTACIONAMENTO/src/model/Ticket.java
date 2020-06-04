package model;

/**
 * @author amaranth.rosa
 */
public class Ticket {

	private static final int TARIFA_HORA = 3;
	private static int sequencia;

	private boolean tarifaPaga;
	private String codigo;
	private int horaEntrada;
	private int horaSaida;

	public Ticket(int horaEntrada) {
		sequencia++;

		setHoraEntrada(horaEntrada);
		setCodigo(String.valueOf(sequencia));
	}

	/*
	 * Retorna valor valor da tarifa-base multiplicado pelo número de horas
	 */
	public int getTarifaTotal() {
		return TARIFA_HORA * (getHoraSaida() - getHoraEntrada());
	}

	public boolean isTarifaPaga() {
		return tarifaPaga;
	}

	public void setTarifaPaga(boolean tarifaPaga) {
		this.tarifaPaga = tarifaPaga;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + ", entrada: " + horaEntrada + ", saída: " + horaSaida;
	}

}
