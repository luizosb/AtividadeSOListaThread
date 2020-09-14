package exercicio1;

public class ThreadCalculoEx1 extends Thread {

	private int valores;
	private int tamanhoVetor;
	private int valorNumerico;
	
	public ThreadCalculoEx1(int valores, int tamanhoVetor, int valorNumerico) {
		this.tamanhoVetor=tamanhoVetor;
		this.valores=valores;
		this.valorNumerico=valorNumerico;
	}
	
	@Override
	public void run() {
		calculoTempoVetorImparEPar();
	}

	private void calculoTempoVetorImparEPar() {
		int vetor[] = new int [tamanhoVetor];
		int somarParTempo=0;
		int somarImparTempo=0;
		if(valorNumerico%2==0) {
			 for (int i = 0 ; i < vetor.length; i++) {
				 vetor[i] = valores;
			 }
			 double tempoPar = System.nanoTime() / Math.pow(10, 9);
			 somarParTempo += tempoPar; 
		} else {
			 for (int i : vetor) {
				vetor[i] = valores;
			 }
			 double tempoImpar = System.nanoTime() / Math.pow(10, 9);
			 somarImparTempo+=tempoImpar;
		}
		System.out.println("Valor do tempo com número ímpar: " + somarImparTempo + " segundos.");
		System.out.println("Valor do tempo com número par: " + somarParTempo + " segundos.");
		
	}
	
}
