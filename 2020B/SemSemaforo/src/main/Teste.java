package main;

/**
 * @author amaranth.rosa
 */
public class Teste {

	public static void main(String[] args) {

		Numero n = new Numero(1);
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
