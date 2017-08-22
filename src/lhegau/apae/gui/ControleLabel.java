package lhegau.apae.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame implements ActionListener{

	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JLabel lbl1 = new JLabel("Peruzinho");
	
	public ControleLabel(){
		super("APAE CORP");
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 18);
		
		
		lbl1.setToolTipText("Peruzão");
		lbl1.setFont(fonte);
		lbl1.setForeground(Color.red);
		
		ImageIcon img = new ImageIcon(getClass().getResource("fotos/Bass.png"));
		JLabel lblImg = new JLabel(img);
		
		btn1.setText("Lagarto");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(lbl1);
		c.add(btn1);
		c.add(btn2);
		c.add(lblImg);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
		public void actionPerformed(ActionEvent event) {
		lbl1.setToolTipText("Peruzinho");
		lbl1.setText("Peruzão!");
	}

	
	public static void main(String[] args) {
		new ControleLabel();

	}


	
}
