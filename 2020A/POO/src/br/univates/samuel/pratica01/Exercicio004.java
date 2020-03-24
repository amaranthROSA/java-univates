package br.univates.samuel.pratica01;

import br.univates.samuel.Entrada;

public class Exercicio004 {
	public static void main(String[] args) {
		boolean loop = true;

		int acumulador = 0;

		while (loop == true) {
			int num = Entrada.leiaInt("Infome um número inteiro: ");

			if (num > 0) {
				acumulador += num;

			} else if (num == 0) {
				System.out.println("Programa encerrado.");

				loop = false;
			} 
		}

		System.out.println("Soma dos números positivos: " + acumulador);

	}
}