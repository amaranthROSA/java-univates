package br.univates.samuel.pratica05.ex02;

public class Caminhao {
	private String placa;
	private int pesoKG;

	public Caminhao(String placa, int peso) {
		this.placa = placa;
		this.pesoKG = peso;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPesoKG() {
		return pesoKG;
	}

	public void setPesoKG(int pesoKG) {
		this.pesoKG = pesoKG;
	}

}
