package controller;

public class ThreadVetor extends Thread {

	
	public ThreadVetor() {
	}
	
	@Override
	public void run() {
		System.out.println("Numero da Thread (ID) : " + this.getId());
	}
}
