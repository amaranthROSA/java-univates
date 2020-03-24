package br.univates.samuel.pratica05.ex04;

public class TestaNumeros {
	private int acumulador;
	private boolean stop = false;

	// vai encerrar e mostar a soma se receber valor igual a zero
	public void avaliar(int numero) {
		if (numero > 0) {
			this.acumulador += numero;
		} else if (numero == 0) {
			System.out.println("Encerrando execução.");
			stop = true;
		}

		else {
			System.out.println("Informe um número válido!");
		}
	}

	public boolean isStop() {
		return stop;
	}

	public int getSoma() {
		return this.acumulador;
	}

}
