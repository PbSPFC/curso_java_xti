package lhegau.apae.erros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Assertions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean go = false;
		String n1;
		int n;
		
		do{
		n1 = JOptionPane.showInputDialog("Digite um n�mero de 1 a 10");
		n = Integer.parseInt(n1);
		assert (n >= 1 && n <= 10) : "Valor diferente de 1 a 10!";
		if (n >= 1 && n <= 10){
			go = true;
			}else{
				JOptionPane.showMessageDialog(null, n + " � um valor inv�lido!");
			}
		}while(go == false);
		
		JOptionPane.showMessageDialog(null, "O n�mero que voc� digitou � " + n);
		
	}

}
