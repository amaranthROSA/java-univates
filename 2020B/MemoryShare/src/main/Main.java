package main;

import java.io.RandomAccessFile;

public class Main {

	private static final int count = 50;

	public static void main(String[] args) throws Exception {
		RandomAccessFile arquivosSaida = new RandomAccessFile("saida.txt", "rw");
		Buffer bffSaida = new Buffer(arquivosSaida, count);

		BufferEscrita escrita1 = new BufferEscrita(1, bffSaida, 'a', 5);
		BufferEscrita escrita2 = new BufferEscrita(2, bffSaida, 'b', 5);
		BufferLeitura leitura1 = new BufferLeitura(3, bffSaida, 10);
		BufferLeitura leitura2 = new BufferLeitura(4, bffSaida, 10);

		escrita1.start();
		leitura1.start();
		escrita2.start();
		leitura2.start();
	}
}
