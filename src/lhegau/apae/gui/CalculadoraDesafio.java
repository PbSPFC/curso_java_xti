package lhegau.apae.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lhegau.apae.gui.ControleText.BtnCriar;
import lhegau.apae.gui.ControleText.BtnSair;

public class CalculadoraDesafio extends JFrame{

	JTextField txtCalc = new JTextField();
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn0 = new JButton("0");
	JButton btnMais = new JButton("+");
	JButton btnMenos = new JButton("-");
	JButton btnMulti = new JButton("*");
	JButton btnDivi = new JButton("/");
	JButton btnPonto = new JButton(".");
	JButton btnCalc = new JButton("=");
	
	class Btn1 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "1");
		}
	}
	
	class Btn2 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "2");
		}
	}
	
	class Btn3 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "3");
		}
	}
	
	class Btn4 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "4");
		}
	}
	
	class Btn5 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "5");
		}
	}
	
	class Btn6 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "6");
		}
	}
	
	class Btn7 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "7");
		}
	}
	
	class Btn8 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "8");
		}
	}
	
	class Btn9 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "9");
		}
	}
	
	class Btn0 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "0");
		}
	}
	
	class BtnMais implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "+");
		}
	}
	
	class BtnMenos implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "-");
		}
	}
	
	class BtnMulti implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "*");
		}
	}
	
	class BtnDivi implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + "/");
		}
	}
	
	class BtnPonto implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String x = txtCalc.getText();
			txtCalc.setText(x + ".");
		}
	}
	
	class BtnCalc implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			Calculo c = new Calculo();
			String x = txtCalc.getText();
			x = c.calc(x);
			txtCalc.setText(x);
		}
	}
	
	
	public CalculadoraDesafio(){
		super("Calculadora da APAE");
		
		btn1.addActionListener(new Btn1());
		btn2.addActionListener(new Btn2());
		btn3.addActionListener(new Btn3());
		btn4.addActionListener(new Btn4());
		btn5.addActionListener(new Btn5());
		btn6.addActionListener(new Btn6());
		btn7.addActionListener(new Btn7());
		btn8.addActionListener(new Btn8());
		btn9.addActionListener(new Btn9());
		btn0.addActionListener(new Btn0());
		btnMais.addActionListener(new BtnMais());
		btnMenos.addActionListener(new BtnMenos());
		btnMulti.addActionListener(new BtnMulti());
		btnDivi.addActionListener(new BtnDivi());
		btnPonto.addActionListener(new BtnPonto());
		btnCalc.addActionListener(new BtnCalc());
		
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,4));
		
		c2.add(btn7);c2.add(btn8);c2.add(btn9);c2.add(btnDivi);
		c2.add(btn4);c2.add(btn5);c2.add(btn6);c2.add(btnMulti);
		c2.add(btn1);c2.add(btn2);c2.add(btn3);c2.add(btnMenos);
		c2.add(btn0);c2.add(btnCalc);c2.add(btnPonto);c2.add(btnMais);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
		c.add(BorderLayout.NORTH, txtCalc);
		c.add(c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CalculadoraDesafio();
	}

}
