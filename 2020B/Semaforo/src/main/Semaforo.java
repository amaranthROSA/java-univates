package main;

/**
 * @author amaranth.rosa
 */
public class Semaforo {

	private int contador = 0;

	public Semaforo(int valorInicial) {
		contador = valorInicial;
	}

	public synchronized void P() {
		if (contador <= 0)
			try { /* esperador até que cont > 0 */
				wait();
			} catch (InterruptedException e) {
			}
		contador--;
	}

	public synchronized void V() {
		contador++;
		notify(); /* acordar quem estiver em espera */
	}

}
