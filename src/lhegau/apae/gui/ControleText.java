package lhegau.apae.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleText extends JFrame{
	
		JTextField txt1 = new JTextField();
		JPasswordField txt2 = new JPasswordField();
		JButton btnCriar = new JButton("Criar");
		JButton btnLogar = new JButton("Logar");
		JButton btnLimpar = new JButton("Limpar");
		JButton btnSair = new JButton("Sair");
		String login = "", senha = "";
		int cc = 0;
		
		
	class BtnCriar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			login = txt1.getText();
			senha = txt2.getText();//Array de char = passwordfield
			if(!(login.equals("") && senha.equals(""))){
				JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
				cc++;
			}else{
				JOptionPane.showMessageDialog(null, "Campos inválidos!");
			}
			
		}
		
	}
	
	class BtnLogar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(cc == 0){
				JOptionPane.showMessageDialog(null, "Nenhuma conta criada, crie uma conta!");
			}else if (login.equals(txt1.getText()) && senha.equals(txt2.getText())){
				JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
			}else{
				JOptionPane.showMessageDialog(null, "Login e Senha inválidos!");
			}
		}
		
	}
	
	class BtnLimpar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			txt1.setText("");
			txt2.setText("");
		}
	}
	
	class BtnSair implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	public ControleText(){
		super("Textos e Senhas");
		
		btnCriar.addActionListener(new BtnCriar());
		btnLogar.addActionListener(new BtnLogar());
		btnLimpar.addActionListener(new BtnLimpar());
		btnSair.addActionListener(new BtnSair());
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("Login: "));
		c.add(txt1);
		c.add(new JLabel("Senha: "));
		c.add(txt2);
		c.add(btnCriar);
		c.add(btnLogar);
		c.add(btnLimpar);
		c.add(btnSair);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new ControleText();
	}

	

}
