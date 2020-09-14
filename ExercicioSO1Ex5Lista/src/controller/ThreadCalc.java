package controller;

import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ThreadCalc extends Thread {
	
	private JLabel carro;
	private JButton btnIniciar;
	private JLabel nome;
	private static int podio;
	
	public ThreadCalc(JLabel carro, JButton btnIniciar, JLabel nome, int pod) {
		this.carro = carro;
		this.btnIniciar = btnIniciar;
		this.nome = nome;
		podio = pod;
	}


	@Override
	public void run() {
		executa();
	}
	
	private void executa() {
		btnIniciar.setVisible(false);;
		Random random = new Random();
		Rectangle posicao;
		Rectangle posicao_placar;
		
		posicao = carro.getBounds();
		carro.setBounds(posicao);
		
		posicao_placar = nome.getBounds();
		
		
		while(posicao.x < 660) {
			try {
				Thread.sleep(5);
			}
			
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			posicao.x = posicao.x + random.nextInt(5);
			carro.setBounds(posicao);
		}
		if(posicao_placar.y == 34) {
			if (podio == 0) {
				podio++;
			}
			else {
				posicao_placar.y = 79;
				nome.setBounds(posicao_placar);
			}
		}
		else {
			if (podio == 0) {
				posicao_placar.y = 34;
				nome.setBounds(posicao_placar);
				podio++;
			}
		}
		
		nome.setVisible(true);
		
		btnIniciar.setVisible(true);
	}
}
