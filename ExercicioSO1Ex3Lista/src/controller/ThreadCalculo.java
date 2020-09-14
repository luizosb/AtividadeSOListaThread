package controller;

public class ThreadCalculo extends Thread {
	
	private int linha[];
	private int numLinha;
	
	public ThreadCalculo(int linha[], int numLinha) {
		this.linha=linha;
		this.numLinha = numLinha;
	}
	
	@Override
	public void run() {
		calculoLinhaPorLinha();
	}

	private void calculoLinhaPorLinha() {
		int somaDosNumerosDeCadaLinha = 0;
		int l;
		
		for(l = 0; l<5;l++) {
			somaDosNumerosDeCadaLinha += linha[l]; 
		}
		System.out.println("A soma dos números da linha " + (numLinha+1) + ": " + somaDosNumerosDeCadaLinha);
	}
	
	

}
