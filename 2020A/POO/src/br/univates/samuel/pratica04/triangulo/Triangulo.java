/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.samuel.pratica04.triangulo;

/**
 *
 * @author Robert
 */
public final class Triangulo {
	double lado1;
	double lado2;
	double lado3;
	double area;
	double perimetro;
	String tipo;

	public Triangulo(double l1, double l2, double l3) {
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;

	}

	public boolean ValidarTriangulo() {
		boolean ehtringulo = false;
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
			ehtringulo = true;
		return ehtringulo;
	}

	public void CalcularPerimetro() {
		perimetro = lado1 + lado2 + lado3;
	}

	public double RetornarPerimetro() {
		return perimetro;
	}

	public void MostrarPerimetro() {
		System.out.println("Perimetro do triangulo: " + perimetro);

	}

	public String TipoTriangulo() {
		tipo = "isosceles";
		if (lado1 == lado2 && lado1 == lado3)
			tipo = "equilatero";
		if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
			tipo = "escaleno";

		return tipo;
	}

}

/*
 * Triângulo --------------------------------------------- lado1 double lado2
 * double lado3 double área double perímetro double tipo (equilátero,
 * isósceles e escaleno). --------------------------------------------------
 * Triangulo (l1,l2,l3) ValidarTriangulo () boolean CalcularPerimetro()
 * CalcularArea() DefinirTipo() InformarTipo() String
 * 
 */