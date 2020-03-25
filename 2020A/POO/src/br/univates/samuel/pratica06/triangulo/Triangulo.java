package br.univates.samuel.pratica06.triangulo;

public class Triangulo {
	double lado1;
	double lado2;
	double lado3;
	double area;
	double perimetro;
	String tipo;
	double b;
	double h;
	double A;

	public Triangulo(double l1, double l2, double l3) {
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;

	}

	public Triangulo() {

	}

	public boolean validarTriangulo() {
		boolean ehtringulo = false;
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
			ehtringulo = true;
		return ehtringulo;
	}

	public void calcularPerimetro() {
		perimetro = lado1 + lado2 + lado3;
	}

	public double retornarPerimetro() {
		return perimetro;
	}

	public void mostrarPerimetro() {
		System.out.println("Perimetro do triangulo: " + perimetro);

	}

	public String tipoTriangulo() {
		tipo = "isosceles";
		if (lado1 == lado2 && lado1 == lado3)
			tipo = "equilatero";
		if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
			tipo = "escaleno";

		return tipo;
	}

	public void calculaAreaTriangRet(double base, double altura) {
		this.b = base;
		this.h = altura;

		this.A = (b * h) / 2;

	}

}
