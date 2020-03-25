package br.univates.samuel.pratica06.retangulo;

public class Retangulo {
	private double base;
	private double altura;
	private double area;
	private double perimetro;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Retangulo() {

	}

	// getters e setters

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// metodos de calculo

	public void calculaArea(double base, double altura) {
		this.area = base * altura;
	}

	public void calculaPerimetro(double base, double altura) {
		this.perimetro = (base + altura) * 2;
	}

}
