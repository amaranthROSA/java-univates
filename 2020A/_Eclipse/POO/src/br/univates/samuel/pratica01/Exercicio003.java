package br.univates.samuel.pratica01;

import br.univates.samuel.Entrada;

public class Exercicio003 {
	public static void main(String[] args) {

		int mult = Entrada.leiaInt("Infomre um número: ");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "x" + mult + " = " + i * mult);
		}
	}

}
