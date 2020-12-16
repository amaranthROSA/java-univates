package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.apache.commons.io.IOUtils;

public class ThreadLauncher {

	private static String fileContent;

	public static void main(String[] args) {

		try {
			RandomAccessFile rdmFile = new RandomAccessFile("saida.txt", "rw");
			FileInputStream inptStream = new FileInputStream(rdmFile.getFD());

			fileContent = IOUtils.toString(inptStream, "UTF-8");

			System.out.println(fileContent + "\n");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		ThreadFabric thread1 = new ThreadFabric("thread1");
		thread1.start();

		ThreadFabric thread2 = new ThreadFabric("thread2");
		thread2.start();

	}
}
