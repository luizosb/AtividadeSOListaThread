package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ControleCarros {

	private JLabel delorean;
	private JLabel ecto;
	private JButton btnIniciar;
	private JLabel delorean_nome;
	private JLabel ecto_nome;
	
	public CarroController(JLabel delorean, JLabel ecto, JButton btnIniciar, JLabel delorean_nome, JLabel ecto_nome) {
		this.delorean = delorean;
		this.ecto = ecto;
		this.btnIniciar = btnIniciar;
		this.delorean_nome = delorean_nome;
		this.ecto_nome = ecto_nome;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		delorean.setBounds(-180, 335, 328, 129);
		ecto.setBounds(-225, 415, 328, 129);
		
		delorean_nome.setBounds(815, 34, 148, 28);
		delorean_nome.setVisible(false);
		
		ecto_nome.setBounds(815, 79, 148, 28);
		ecto_nome.setVisible(false);
		
		executa();
	}
	
	public void executa() {
		int podio = 0;
		ThreadCalc tdelorean = new ThreadCalc(delorean, btnIniciar, delorean_nome, podio);
		ThreadCalc tecto = new ThreadCalc(ecto, btnIniciar, ecto_nome, podio);
		
		tdelorean.start();
		tecto.start();
	}
}
