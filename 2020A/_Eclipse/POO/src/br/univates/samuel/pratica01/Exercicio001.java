package br.univates.samuel.pratica01;

import br.univates.samuel.Entrada;

public class Exercicio001 {
	public static void main(String[] args) {

		int lado = 0;
		int altura = 0;

		int la = Entrada.leiaInt("Informe o lado do retângulo:");
		int al = Entrada.leiaInt("Informe a altura do triângulo: ");

		int per = (la + al) * 2;
		int are = la * al;

		System.out.println("Perímetro do retângulo: " + per);
		System.out.println("Área do retângulo: " + are);
	}
}
