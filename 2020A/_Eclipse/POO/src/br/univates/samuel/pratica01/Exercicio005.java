package br.univates.samuel.pratica01;

import br.univates.samuel.Entrada;

public class Exercicio005 {
	public static void main(String[] args) {
		boolean loop = true;

		int acumulador = 0;
		int count = 0;

		while (loop == true) {
			int num = Entrada.leiaInt("Infome um número inteiro: ");

			if (num > 0) {
				acumulador += num;
				count++;

			} else if (num == 0) {
				System.out.println("Programa encerrado.");

				loop = false;
			}
		}

		System.out.println("Média dos números positivos: " + (acumulador / count));

	}
}
