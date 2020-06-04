package br.univates.samuel.pratica05.ex04;

import br.univates.samuel.Entrada;

public class Main {
	public static void main(String[] args) {

		TestaNumeros t = new TestaNumeros();

		while (!t.isStop()) {
			t.avaliar(Entrada.leiaInt("Infome um número inteiro positivo: "));
		}

		System.out.println("\nA soma total é: " + t.getSoma());
	}
}
