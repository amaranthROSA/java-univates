package br.univates.samuel.pratica01;

import br.univates.samuel.Entrada;

public class Exercicio005_Professor {
	public static void main(String[] args) {

		double soma = 0;

		int quant = 0;

		double x = Entrada.leiaDouble("Infome um n�mero inteiro: ");

		while (x != 0) {

			if (x > 0) {

				soma += x;
				quant++;

			}
			x = Entrada.leiaDouble("Infome um n�mero inteiro: ");

		}
		double media = soma / quant;
		System.out.println("Media dos n�meros positivos: " + soma / quant);

	}
}