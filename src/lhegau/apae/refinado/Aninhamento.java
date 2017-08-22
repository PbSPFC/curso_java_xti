package lhegau.apae.refinado;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Aninhamento extends JFrame{

	JButton btn1;
	JButton btn2;
	JLabel lbl1;
	JLabel lbl2;
	int replay1 = 0;
	int replay2 = 0;
	
	public Aninhamento(){
		super("Super Peru!");
		
		btn1 = new JButton("APAE");
		lbl1 = new JLabel("Classe Aninhada replay: " + replay1);
		btn1.addActionListener(new Btn1());
		
		btn2 = new JButton("PERU");
		lbl2 = new JLabel("Classe Anonima replay: " + replay2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				replay2++;
				System.err.println("Você clicou no botão " + btn2.getText());
				lbl2.setText("Classe Anonima replays: " + replay2);
			}
		});
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Lagarto!"));
		c.add(btn1);
		c.add(btn2);
		c.add(lbl1);
		c.add(lbl2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public class Btn1 implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			replay1++;
			System.err.println("Você clicou no botão " + btn1.getText());
			lbl1.setText("Classe Aninhada replays: " + replay1);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Aninhamento janela = new Aninhamento();
		
		Aninhamento.Btn1 listener = janela.new Btn1();//Classe envolvente da Classe Aninhada "listener" Btn1
		
	}

}
