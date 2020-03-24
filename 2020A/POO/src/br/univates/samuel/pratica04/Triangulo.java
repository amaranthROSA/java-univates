package br.univates.samuel.pratica04;

public class Triangulo {

	private double lado1;
	private double lado2;
	private double lado3;
	private double area;
	private double perimetro;
	// tipos: equilátero, isósceles e escaleno)

	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public String definirTipo() {
		return null;
	}

	public boolean validarTriangulo() {
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 > lado3 + lado1) {
			return true;
		} else {
			return false;
		}
	}

	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}

	public double calcularArea() {
		return null;
	}

	public String tipoTriangulo() {
		String tipo = "";
		if (lado1 == lado2 && lado1 == lado3) {
			tipo = "Equilátero";
		}
		if (lado1 != lado2 && lado1 != lado3) {
			tipo = "isósceles";
		}
		return tipo;
	}

}
