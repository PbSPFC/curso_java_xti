package lhegau.apae.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTesteArea extends JFrame{
	
	JTextArea txa1 = new JTextArea();
	JButton btn1 = new JButton("Peru onde você está?");
	
	class Btn1 implements ActionListener{		
		public void actionPerformed(ActionEvent e) {
			JFileChooser c = new JFileChooser();
			c.showOpenDialog(new ControleTesteArea());
			File f = c.getSelectedFile();
			try{
				Path path = Paths.get(f.getAbsolutePath());
				String r = new String(Files.readAllBytes(path));
				txa1.setText(r);
			}catch(Exception erro){
				JOptionPane.showMessageDialog(null, "Peru!!!");
			}
		}
		
	}
	
	public ControleTesteArea(){
		super();
		
		txa1.setFont(new Font("Serif", Font.PLAIN, 18));
		JScrollPane scroll = new JScrollPane(txa1);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.NORTH,btn1);
		c.add(BorderLayout.CENTER,scroll);
		btn1.addActionListener(new Btn1());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
		
	}
	
	public static void main(String[]args){
		new ControleTesteArea();
	}
}
