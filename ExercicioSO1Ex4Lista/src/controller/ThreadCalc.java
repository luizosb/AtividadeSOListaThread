package controller;

public class ThreadCalc extends Thread {

	private String nome;
	private int distanciaPercorrida;
	private int distanciaTotalCorrida;
	private int pulo;
	private static int colocacao = 0;
	private final static int puloMaximo = 5;

	public ThreadCalc(String nome, int distanciaTotalCorrida) {
		super(nome);
		this.distanciaTotalCorrida = distanciaTotalCorrida;
		this.nome = nome;
	}

	public void sapoPulando() {
		pulo = (int) (Math.random() * puloMaximo);
		distanciaPercorrida += pulo;
		if (distanciaPercorrida > distanciaTotalCorrida) {
			distanciaPercorrida = distanciaTotalCorrida;
		}
	}

	public void mostrandoPuloSapo() {
		System.out.println("O " + nome + " pulou " + pulo + " cm e percorreu " + distanciaPercorrida + " cm.");
	}

	// Passa para a próxima Thread
	public void proximoSapo() {
		yield();
	}

	public void colococaoFinalSapo() {
		colocacao++;
		System.out.println("\nO " + nome + " foi o " + colocacao + "º colocado.");
	}

	@Override
	public void run() {
		while (distanciaPercorrida < distanciaTotalCorrida) {
			sapoPulando();
			mostrandoPuloSapo();
			proximoSapo();

			try {
				sleep(300);
			} catch (InterruptedException e) {
			}
		}
		try {
			sleep(3000);
		} catch (InterruptedException e) {
		}
		colococaoFinalSapo();

	}

}
