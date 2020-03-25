package br.univates.samuel.pratica04.triangulo;

import br.univates.samuel.Entrada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert
 */
public class TesteTriangulo {
	public static void main(String[] args) {
		double ld1 = Entrada.leiaDouble("Digite o tamanho do primeiro lado");
		double ld2 = Entrada.leiaDouble("Digite o tamanho do segundo lado");
		double ld3 = Entrada.leiaDouble("Digite o tamanho do terceiro lado");

		Triangulo tr1 = new Triangulo(ld1, ld2, ld3);

		ld1 = Entrada.leiaDouble("Digite o tamanho do primeiro lado");
		ld2 = Entrada.leiaDouble("Digite o tamanho do segundo lado");
		ld3 = Entrada.leiaDouble("Digite o tamanho do terceiro lado");

		Triangulo tr2 = new Triangulo(ld1, ld2, ld3);

		System.out.println("Dados do primeiro triangulo:");
		System.out.println("Este objeto é um triangulo? " + tr1.ValidarTriangulo());
		tr1.CalcularPerimetro();

		System.out.println("Perimetro do triangulo é: " + tr1.RetornarPerimetro());
		tr1.MostrarPerimetro();

		System.out.println("Tipo de triangulo: " + tr1.TipoTriangulo());

		System.out.println("\n\n\n Dados do segundo triangulo:");
		System.out.println("Este objeto é um triangulo? " + tr2.ValidarTriangulo());
		tr2.CalcularPerimetro();

		System.out.println("Perimetro do triangulo é: " + tr2.RetornarPerimetro());
		tr2.MostrarPerimetro();

		System.out.println("Tipo de triangulo: " + tr2.TipoTriangulo());

		System.exit(0);
	}

}
