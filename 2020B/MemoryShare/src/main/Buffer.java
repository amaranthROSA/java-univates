package main;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class Buffer {

	MappedByteBuffer saida;
	RandomAccessFile arquivomapeado;
	int count;
	boolean cheio;

	Buffer(RandomAccessFile arquivomapeado, int count) throws IOException {
		this.count = count;
		this.saida = arquivomapeado.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, this.count);
		cheio = false;
	}

	public synchronized void getSaida(int num) {
		if (cheio == false) {
			try {
				System.out.println("Thread" + num + ": Aguardando preencher o Buffer\n");
				wait(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < this.saida.capacity(); i++) {
			System.out.print((char) saida.get(i));
		}
		System.out.println("\nThread" + num + ": Lendo Arquivo de memória... Completo");
		cheio = false;
		saida.clear();
		notifyAll();
	}

	public synchronized void setSaida(char letra, int num) {
		if (cheio == true) {
			try {
				System.out.println("Thread" + num + ": Aguardando ler o buffer\n");
				wait(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (cheio == false) {
			for (int i = 0; i < this.saida.capacity(); i++) {
				this.saida.put((byte) letra);
			}
			System.out.println("\nThread" + num + ": Escrevendo no arquivo de memoria... Completo");
		}
		cheio = true;
		notifyAll();
	}
}
