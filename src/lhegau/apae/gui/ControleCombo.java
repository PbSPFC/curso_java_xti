package lhegau.apae.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame{

	
	JComboBox<String> cb1 = new JComboBox<String>();
	ImageIcon[] imgs = {
			new ImageIcon(getClass().getResource("fotos/apaegirl.jpg")),
			new ImageIcon(getClass().getResource("fotos/Bass.png")),
			new ImageIcon(getClass().getResource("fotos/rk.jpg")),
			new ImageIcon(getClass().getResource("fotos/BassExe.png"))
	};
	JLabel lbl1 = new JLabel(imgs[0]);
	
	class CBListener implements ItemListener{

	
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED){
				lbl1.setIcon(imgs[cb1.getSelectedIndex()]);
			}
			
		}
		
	}
	
	public ControleCombo(){
		super("Album");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(cb1);
		cb1.addItem("APAE Girl");
		cb1.addItem("Bass");
		cb1.addItem("Royal Knight");
		cb1.addItem("Bass Exe");
		c.add(lbl1);
		cb1.addItemListener(new CBListener());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new ControleCombo();
		
	}

}
