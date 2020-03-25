package br.univates.samuel.pratica06.circulo;

public class Circulo {

	private double raio;
	private double diametro;

	@SuppressWarnings("unused")
	private double circunferencia;

	public Circulo() {

	}

	// getters e setters

	public double getRaio() {
		return raio;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	// metodos de calculo

	public void calculaDiametro(double raio) {
		this.diametro = raio * 2;
	}

	public void calculaCircunferenciaComDiametro(double diametro) {
		this.circunferencia = diametro * Math.PI;
	}

	public void calculaCircunferenciaComRaio(double raio) {
		this.circunferencia = raio * Math.PI * 2;
	}

}
