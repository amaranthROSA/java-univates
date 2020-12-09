package main;

/**
 * @author amaranth.rosa
 */
public class ThreadMain implements Runnable {
	private Thread thread;
	private String threadName;

	ThreadMain(String name) {
		threadName = name;
		System.out.println("Criando " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Executando " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Dormir por 50ms
				Thread.sleep(50);
				System.out.println("  Nome: " + thread.getName() + " - Vivo: " + thread.isAlive() + " - Prioridade: "
						+ thread.getPriority());
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrompida.");
		}
		System.out.println("Thread " + threadName + " saindo.");
	}

	public void start() {
		System.out.println("Iniciando " + threadName);
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}
