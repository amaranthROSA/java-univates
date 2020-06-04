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

	public void defineLados(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

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

	public double calculaArea() {
		return area = base * altura;
	}

	public double calculaPerimetro() {
		return perimetro = (base + altura) * 2;
	}

}
