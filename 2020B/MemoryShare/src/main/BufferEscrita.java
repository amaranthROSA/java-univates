package main;

public class BufferEscrita extends Thread {

	int id;
	Buffer saida;
	char disp;
	int limite;

	BufferEscrita(int id, Buffer saida, char disp, int limite) {
		this.saida = saida;
		this.id = id;
		this.disp = disp;
		this.limite = limite;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			saida.setSaida(disp, id);
		}
	}
}
