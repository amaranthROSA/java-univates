package br.univates.samuel.pratica01;

import br.univates.samuel.Entrada;

public class Exercicio002 {
	public static void main(String[] args) {

		int peso = Entrada.leiaInt("Informe o peso da carga (KG): ");

		if (peso > 40000) {
			System.out.println("Você está multado!");
		} else {
			System.out.println("Boa viagem!");
		}

	}
}
