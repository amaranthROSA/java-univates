package br.univates.samuel.pratica05.ex05;

import br.univates.samuel.Entrada;

public class Main {
	public static void main(String[] args) {

		TestaNumeros t = new TestaNumeros();

		while (!t.isStop()) {
			t.avaliar(Entrada.leiaInt("Infome um n�mero (zero encerra): "));
		}

		System.out.println("\nA media dos positivos �: " + t.getMedia() + "\n");

	}
}
