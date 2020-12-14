package main;

/**
 * @author amaranth.rosa
 */
public class Teste {

	public static void main(String[] args) {

		int numeroPermissoes = 1;
//		Semaphore mutex = new Semaphore(numeroPermissoes);
//		Semaphore cheio = new Semaphore(0);
//		Semaphore vazio = new Semaphore(1);

//		Numero n = new Numero(0, mutex, cheio, vazio);
		Numero n = new Numero(0);
		Produtor p = new Produtor(n);
		Consumidor c = new Consumidor(n);
		Consumidor c1 = new Consumidor(n);
		Consumidor c2 = new Consumidor(n);

		p.start();
		c.start();
		c1.start();
		c2.start();

	}

}
