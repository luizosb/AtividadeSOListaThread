package exercicio1;

public class ThreadVetor extends Thread {
	
	private int vetorThread;

	public ThreadVetor(int vetorThread){
		this.vetorThread=vetorThread;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(vetorThread);
	}
	
	
}
