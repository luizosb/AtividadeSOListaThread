package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		ThreadVetor thread1 = new ThreadVetor();
		ThreadVetor thread2 = new ThreadVetor();
		ThreadVetor thread3 = new ThreadVetor();
		ThreadVetor thread4 = new ThreadVetor();
		ThreadVetor thread5 = new ThreadVetor();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}

}
