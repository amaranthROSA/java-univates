package main;

import java.util.concurrent.Semaphore;

/**
 * @author amaranth.rosa
 */
public class Numero {

	private int numero;
	private Semaphore mutex;
	private Semaphore cheio;
	private Semaphore vazio;

	Numero(int numero, Semaphore mutex, Semaphore cheio, Semaphore vazio) {
		this.numero = numero;
		this.mutex = mutex;
		this.cheio = cheio;
		this.vazio = vazio;
	}

	Numero(int numero) {
		this.numero = numero;

	}

	public int consumir(String idThread) {

//		try {
//			cheio.acquire();
//			mutex.acquire();
		System.out.println("  Consumidor " + idThread + "\t consumiu: \t" + this.numero);
//
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			mutex.release();
//			vazio.release();
//		}

		return this.numero;
	}

	public void produzir(String idThread, int valor) {

//		try {
//			vazio.acquire();
//			mutex.acquire();

		this.numero = valor;
		System.out.println("Produtor " + idThread + "\t produziu: \t" + valor);

//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			mutex.release();
//			cheio.release();
//		}

	}
}
