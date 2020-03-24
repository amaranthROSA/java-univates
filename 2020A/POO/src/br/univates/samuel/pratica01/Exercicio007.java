package br.univates.samuel.pratica01;

import br.univates.samuel.Entrada;

public class Exercicio007 {
	public static void main(String[] args) {
		String nome1 = Entrada.leiaString("Informe o primeiro nome: ");
		String nome2 = Entrada.leiaString("Informe o segundo nome: ");
		String sobrenome = Entrada.leiaString("Informe o sobrenome: ");
		
		String abnt_sbn = sobrenome;
		String abnt1 = String.valueOf(nome1.charAt(0));
		String abnt2 = String.valueOf(nome2.charAt(0));
		
		String autor = abnt_sbn.toUpperCase()+", "+abnt1.toUpperCase()+". "+abnt2.toUpperCase()+".";
		
		System.out.println(autor);
				
		
	}
}
