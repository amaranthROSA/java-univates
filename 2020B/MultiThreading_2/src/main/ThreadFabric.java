package main;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ThreadFabric implements Runnable {

	private Thread thread;
	private String threadName;
	private StringBuilder stbOut = new StringBuilder();

	public ThreadFabric(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Execução:	" + threadName);

			try {

				Thread.sleep(1000);
				stbOut.append(i + 1 + ", ");

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Execução das Threads foi suspensa.");
			} finally {

				try {
					RandomAccessFile rdmFile = new RandomAccessFile("saida.txt", "rw");
					FileOutputStream outptStream = new FileOutputStream(rdmFile.getFD());
					BufferedOutputStream bffOtptStream = new BufferedOutputStream(outptStream);

					outptStream.write(stbOut.toString().getBytes());

					bffOtptStream.close();
					outptStream.close();
					rdmFile.close();

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		}
	}

	public void start() {
		System.out.println("Inicializada:	" + threadName);
		if (thread == null) {
			thread = new Thread(this, threadName);

			stbOut.append(threadName + ": ");

			thread.start();
		}

	}

}
