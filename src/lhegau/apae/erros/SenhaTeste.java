package lhegau.apae.erros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SenhaTeste {

	static String pasw = "1234";
	static boolean login = false;
	
	static void autenticar(String senha) throws SenhaInvalidaException{
		do{
			senha = JOptionPane.showInputDialog("Digite sua senha!");
			if(pasw.equals(senha)){
				JOptionPane.showMessageDialog(null, "Efetuando Login, aguarde...");
				login = true;
			}else{
				throw new SenhaInvalidaException("Senha Inválida!");
			}	
		}while(login == false);
	}
	
	
	
	
	public static void main(String[] args) throws SenhaInvalidaException {
		Scanner input = new Scanner(System.in);
		
		do{
			try{
				autenticar(null);
			}catch(SenhaInvalidaException erro1){
				JOptionPane.showMessageDialog(null, erro1);
			}
		}while(login == false);
		
		if (login == true){
			String nome = JOptionPane.showInputDialog("Login Efetuado com sucesso!\nDigite seu nome:");
			JOptionPane.showMessageDialog(null, "Bem vindo " + nome + "!");
		}
		
	}

}
