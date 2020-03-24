package br.univates.samuel.pratica05.ex05;

public class TestaNumeros {
	private int positivoSoma;
	private int positivoCount;
	private int negativoSoma;
	private int negativoCount;
	private boolean stop = false;

	// vai encerrar e mostar a soma se receber valor igual a zero
	public void avaliar(int numero) {
		if (numero > 0) {
			this.positivoSoma += numero;
			this.positivoCount++;

		} else if (numero == 0) {
			System.out.println("Encerrando execução.");
			stop = true;
		}

		else {
			this.negativoCount += numero;
			this.negativoSoma++;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public int getMedia() {
		return positivoSoma / positivoCount;
	}

}
