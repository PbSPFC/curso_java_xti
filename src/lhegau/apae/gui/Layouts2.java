package lhegau.apae.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame {

	public Layouts2(){
		super("Peruzao!");
		
		Container c = getContentPane();
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4, 1));
		c2.add(new JButton("Peru 1"));
		c2.add(new JButton("Peru 2"));
		c2.add(new JButton("Peru 3"));
		c2.add(new JButton("Peru 4"));
		
		c.setLayout(new BorderLayout(25,25));
		c.add(BorderLayout.CENTER, new JButton("Peruzão!"));
		c.add(BorderLayout.EAST, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Layouts2();

	}

}
		/*
		c.setLayout(new BorderLayout(25, 50));
		c.add(BorderLayout.NORTH, new JButton("Norte"));
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		c.add(BorderLayout.EAST, new JButton("Lest"));
		c.add(BorderLayout.WEST, new JButton("Oeste"));
		c.add(BorderLayout.SOUTH, new JButton("Sul"));
		
		c.setLayout(new GridLayout(5, 2));
		c.add(new JButton("Peru 1"));
		c.add(new JLabel("Peru 2"));
		c.add(new JButton("Peru 3"));
		c.add(new JLabel("Peru 4"));
		c.add(new JButton("Peru 5"));
		c.add(new JLabel("Peru 6"));
		*/