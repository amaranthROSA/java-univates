package br.univates.samuel.pratica01;

import br.univates.samuel.Entrada;

public class Exercicio004_Professor {
	public static void main(String[] args) {

		double soma = 0;
		double x = Entrada.leiaDouble("Infome um número inteiro: ");

		while (x != 0) {

			soma += x;
			x = Entrada.leiaDouble("Infome um número inteiro: ");

		}

		System.out.println("Soma dos números positivos: " + soma);

	}
}