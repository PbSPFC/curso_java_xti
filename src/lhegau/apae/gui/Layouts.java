package lhegau.apae.gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Layouts extends JFrame{

	public Layouts(){
		super("Super Saiyan");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Lagarto!"));
		c.add(new JButton("Peru!"));
		c.add(new JTextArea("	"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Layouts();
		
	}

}
