package exercicio1.view;

import java.util.Scanner;

import exercicio1.ThreadCalculoEx1;

public class MainEx1 {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		int tamanhoVetor = 1000;
		int valores = 0;
		int valorNumerico;
		
		for(int i = 0; i < 3; i++) {
			for(int ind = 0; ind < tamanhoVetor; ind++) {
				valorNumerico = i;
				valores = (int) (Math.random() * 100) + 1;
				Thread tCalculo = new ThreadCalculoEx1(valores, tamanhoVetor, valorNumerico);
				tCalculo.start();
			}
		}
		
		
		
	}

}
