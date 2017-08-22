package lhegau.apae.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame{
	
	JTextField txt1 = new JTextField("Lagarto666!", 10);
	JCheckBox cbIta = new JCheckBox("Italíco");
	JCheckBox cbBold = new JCheckBox("Bold");
	
	
	class CBTexto implements ItemListener{

		
		public void itemStateChanged(ItemEvent e) {
			if (cbBold.isSelected() & cbIta.isSelected()){
				txt1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
			}else if (cbBold.isSelected()){
				txt1.setFont(new Font("Serif", Font.BOLD, 18));
			}else if (cbIta.isSelected()){
				txt1.setFont(new Font("Serif", Font.ITALIC, 18));
			}else{
				txt1.setFont(new Font("Serif", Font.PLAIN, 18));
			}
		
		}
	}
	
	public ControleCheck(){
		super("APAE Check");
		
		
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(txt1);
		c.add(cbBold);
		c.add(cbIta);
		cbBold.addItemListener(new CBTexto());
		cbIta.addItemListener(new CBTexto());
		
		
		txt1.setFont(new Font("Serif", Font.PLAIN, 18));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ControleCheck();
	}

}
