package br.univates.samuel.pratica04.testes;

import br.univates.samuel.pratica04.Triangulo;

public class TesteTriangulo {
	public static void main(String[] args) {
		Triangulo tr1 = new Triangulo(10, 10, 15);
		Triangulo tr2 = new Triangulo(10, 15, 15);
		Triangulo tr3 = new Triangulo(15, 15, 15);
		Triangulo tr4 = new Triangulo(10, 15, 30);

		String eh = "É triangulo? ";
		String pr = "; Perímetro: ";

		System.out.println(eh + tr1.validarTriangulo() + pr + tr1.calcularPerimetro());
		System.out.println(eh + tr2.validarTriangulo() + pr + tr2.calcularPerimetro());
		System.out.println(eh + tr3.validarTriangulo() + pr + tr3.calcularPerimetro());
		System.out.println(eh + tr4.validarTriangulo() + pr + tr4.calcularPerimetro());

	}
}
