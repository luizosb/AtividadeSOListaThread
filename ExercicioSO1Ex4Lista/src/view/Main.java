package view;

import controller.ThreadCalc;

public class Main {

	public static void main(String[] args) {
		int qtdSapos = 5;
		int distanciaMaxima = 20;
		int i;

		for (i = 0; i < qtdSapos; i++) {
			Thread tCalculo = new ThreadCalc("Sapo " + (i+1), distanciaMaxima);
			tCalculo.start();
		}

	}

}
