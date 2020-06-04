package br.univates.samuel.pratica05.ex06;

import br.univates.samuel.Entrada;

public class Pedagio {
	private static double TARIFA_MOTO = 2.20;
	private int qtdMotos;
	private static double TARIFA_CARRO = 4.40;
	private int qtdCarros;
	private double totalArrecadado;
	private boolean isExpediente;

	public Pedagio(boolean isExpediente) {
		this.isExpediente = isExpediente;
	}

	public boolean isExpediente() {
		return this.isExpediente;
	}

	public void setExpediente(boolean valor) {
		this.isExpediente = false;
	}

	public int getQtdMotos() {
		return qtdMotos;
	}

	public int getQtdCarros() {
		return qtdCarros;
	}

	public void incrQtdMotos() {
		this.qtdMotos++;
	}

	public void incrQtdCarros() {
		this.qtdCarros++;
	}

	public double getTotalArrecadado() {
		return totalArrecadado;
	}

	public void realizaCobranca(int tipo) {
		if (tipo == 1) {
			totalArrecadado += TARIFA_CARRO;
			incrQtdCarros();

		} else if (tipo == 2) {
			totalArrecadado += TARIFA_MOTO;
			incrQtdMotos();
		}
	}

	public static void main(String[] args) {
		Pedagio pedagio = new Pedagio(true);

		while (pedagio.isExpediente()) {

			int tipo = Entrada.leiaInt("1. Carro; 2. Moto; 3. Finaliza");
			pedagio.realizaCobranca(tipo);
			System.out.println("==========================================");
			System.out.println("Total de carros: " + pedagio.getQtdCarros());
			System.out.println("\nTotal de motos: " + pedagio.getQtdMotos());

			if (tipo == 3) {
				pedagio.setExpediente(false);
			}
		}

		System.out.println("Sistema encerrado.");
		System.out.println("\nTotal arrecadado: " + pedagio.getTotalArrecadado());

	}
}
