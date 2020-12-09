package main;

/**
 * @author amaranth.rosa
 */
public class ThreadTest {
	public static void main(String[] args) {
		ThreadMain r1 = new ThreadMain("Thread-1");
		r1.start();

		ThreadMain r2 = new ThreadMain("Thread-2");
		r2.start();
	}
}
