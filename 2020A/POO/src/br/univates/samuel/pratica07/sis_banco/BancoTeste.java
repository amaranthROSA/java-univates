package br.univates.samuel.pratica07.sis_banco;

import br.univates.samuel.pratica07.sis_banco.model.Cliente;
import br.univates.samuel.pratica07.sis_banco.model.ContaCorrente;

public class BancoTeste {
	public static void main(String[] args) {

		Teste1();
//		Teste2();
	}

	public static void Teste1() {
		Cliente samuel = new Cliente(new Long(001), "Samuel", "Rockenbach", "04266259000");

		ContaCorrente conta1 = new ContaCorrente.Builder(samuel, 001).saldo(100).limite(100).build();

		System.out.println("Saldo atual: " + conta1.getSaldo());
		System.out.println("Limite: " + conta1.getLimite());
		System.out.println();

		conta1.sacar(200);
		System.out.println();
		conta1.getSaldo();
		System.out.println("Saldo: " + conta1.getSaldo());
		System.out.println("Saldo devedor? " + conta1.isSaldoDevedor());

	}

	public static void Teste2() {

	}
}
