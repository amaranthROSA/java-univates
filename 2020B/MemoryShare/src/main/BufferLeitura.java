package main;

public class BufferLeitura extends Thread {

	int id;
	Buffer saida;
	boolean disp;
	int limite;

	BufferLeitura(int count, Buffer saida, int limite) {
		this.saida = saida;
		this.id = count;
		this.limite = limite;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int lim = 0;
			saida.getSaida(id);
		}
	}
}
