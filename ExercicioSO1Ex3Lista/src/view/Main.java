package view;

import controller.ThreadCalculo;

public class Main {
	
	public static void main(String[] args) {
		int l;
		int c;
		int l1 = 0;
		int l2 = 0;
		int l3 = 0;
		int matriz[][] = new int [3][5];
		int linha1[] = new int [5];
		int linha2[] = new int [5];
		int linha3[] = new int [5];
		
		for(l=0; l<3; l++) {
			for(c=0; c<5;c++) {
				matriz[l][c] = (int) (Math.random() * 10);
				if(l==0) {
					linha1[c] =  matriz[l][c];
					l1 = l;
				} else if (l==1) {
					linha2[c] = matriz[l][c];
					l2 = l;
				} else {
					linha3[c] = matriz[l][c];
					l3 = l;
				}
			} 
		}
		
		Thread tCalculo1 = new ThreadCalculo(linha1, l1);
		Thread tCalculo2 = new ThreadCalculo(linha2, l2);
		Thread tCalculo3 = new ThreadCalculo(linha3, l3);
		tCalculo1.start();
		tCalculo2.start();
		tCalculo3.start();
	}
}
