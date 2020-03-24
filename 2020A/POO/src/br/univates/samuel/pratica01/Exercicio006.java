package br.univates.samuel.pratica01;

import br.univates.samuel.Entrada;

public class Exercicio006 {
	public static void main(String[] args) {
		double moto_tarifa = 2.20;
		double carro_tarifa = 4.40;
		double moto_tarifa_acum = 0;
		double carro_tarifa_acum = 0;
		int moto_quant = 0;
		int carro_quant = 0;

		int opcao;
		boolean loop = true;

		while (loop == true) {
			opcao = Entrada.leiaInt("1. Carro; 2. Moto; 3. Finaliza");

			if (opcao == 1) {
				carro_quant++;
				carro_tarifa_acum += carro_tarifa;
				System.out.print("Carro ccomputado.\n");

			} else if (opcao == 2) {
				moto_quant++;
				moto_tarifa_acum += moto_tarifa;
				System.out.print("Moto computada.\n");

			} else if (opcao == 3) {
				System.out.print("Finalizando sistema.\n");
				loop = false;

			} else {
				System.out.println("Escolha uma opção válida!\n");
			}
		}

		System.out.println("Total de motos: " + moto_quant);
		System.out.println("Total de carros: " + carro_quant);
		System.out.println();

		System.out.println("Total arrecadado: R$" + (moto_tarifa_acum + carro_tarifa_acum));
	}
}
