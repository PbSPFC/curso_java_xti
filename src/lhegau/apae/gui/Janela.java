package lhegau.apae.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{

	public Janela(){
		super("Super Lagatojin");
		
		JButton btn1 = new JButton("Peru!");
		getContentPane().add(btn1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Janela();
		
	}

}
