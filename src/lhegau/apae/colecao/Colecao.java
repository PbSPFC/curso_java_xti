package lhegau.apae.colecao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Colecao extends JFrame {

	private JPanel contentPane;
	boolean ativo;
	Collection<String> c = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colecao frame = new Colecao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Colecao() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		TextArea txt1 = new TextArea();
		txt1.setColumns(10);
		txt1.setRows(10);
		txt1.setFont(new Font("Dialog", Font.PLAIN, 24));
		
		
				c.add("A");
				c.add("B");
				c.add("C");
		
				
				
		JButton btn1 = new JButton("Peru");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ativo = true;
				
				txt1.setText(c.toString() + "\n" +
				c.isEmpty() + "\n" +
				c.contains("B"));
				
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JButton btnRemoverA = new JButton("Remover A");
		btnRemoverA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ativo==true){
					c.remove("A");
				}
				txt1.setText(c.toString());
			}
		});
		
		JButton btnRetornarA = new JButton("Retornar A");
		btnRetornarA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.contains("A")){
					txt1.setText(c.toString());
				}else{
				c.add("A");
				txt1.setText(c.toString());
				}
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txt1, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
							.addGap(23))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btn1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
							.addGap(33)
							.addComponent(btnRemoverA)
							.addGap(18)
							.addComponent(btnRetornarA)
							.addGap(104))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btn1)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnRemoverA)
							.addComponent(btnRetornarA)))
					.addGap(10)
					.addComponent(txt1, GroupLayout.PREFERRED_SIZE, 204, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
