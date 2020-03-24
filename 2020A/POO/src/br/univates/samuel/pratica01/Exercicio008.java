package br.univates.samuel.pratica01;

import java.util.Random;

import br.univates.samuel.Entrada;

public class Exercicio008 {
	public static void main(String[] args) {

		double[] mega_sena = new double[6];

		Random rnd = new Random();

		int tipo_jogo = Entrada.leiaInt("1. Manual; 2. Automático");

		for (int i = 0; i < mega_sena.length; i++) {

			if (tipo_jogo == 1) {
				int numero = Entrada.leiaInt("Número apostado: ");

				mega_sena[i] = numero;
			} else if (tipo_jogo == 2) {

				while (i < mega_sena.length) {
					// mega_sena[i] = (Math.random()) * ((10 - 1) + 1);
					mega_sena[i] = rnd.nextInt(10);
					i++;
				}
			}
		}

		for (int i = 0; i < mega_sena.length; i++) {
			System.out.print("Número: " + mega_sena[i] + "\t");
		}
	}
}
