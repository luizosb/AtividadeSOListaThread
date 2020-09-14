package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldVencedor;
	private JTextField textFieldPerdedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCarro1 = new JLabel("Carro 1");
		lblCarro1.setForeground(Color.RED);
		lblCarro1.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblCarro2 = new JLabel("Carro 2");
		lblCarro2.setForeground(Color.BLUE);
		lblCarro2.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblVencedor = new JLabel("Vencedor");
		lblVencedor.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblPerdedor = new JLabel("Perdedor");
		lblPerdedor.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		textFieldVencedor = new JTextField();
		textFieldVencedor.setColumns(10);
		
		textFieldPerdedor = new JTextField();
		textFieldPerdedor.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(189)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblPerdedor, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textFieldPerdedor, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblVencedor)
									.addGap(18)
									.addComponent(textFieldVencedor))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(40)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblCarro2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblCarro1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))))
					.addContainerGap(336, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(121)
					.addComponent(lblCarro1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVencedor)
						.addComponent(textFieldVencedor, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPerdedor, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldPerdedor, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(lblCarro2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(104))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public 
}
