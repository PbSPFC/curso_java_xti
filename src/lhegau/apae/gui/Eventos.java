package lhegau.apae.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{
	
	
	JButton btn;
	int replay = 0;
	
	public Eventos(){
		super("Eventos");
		
		btn = new JButton("Peru");
		btn.addActionListener(this);
		getContentPane().add(btn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		++replay;
		btn.setText("Olo! " + replay);
		
	}
	public static void main(String[] args) {
		
		new Eventos();

	}

}
