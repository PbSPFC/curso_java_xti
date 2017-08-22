package lhegau.apae.logica;
/*
*Calcular o IMC
*IMC = pesoEmQuilogramas / (AlturaEmMetros * AlturaEmMetros)
*/
import javax.swing.JOptionPane;
import java.util.Scanner;

public class IMC {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		double pesoEmQuilogramas;
		double alturaEmMetros;
		double imc;
		
		pesoEmQuilogramas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso: "));
		
		alturaEmMetros = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura: "));
		
		imc = (pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros));
		
		String imcS = Double.toString(imc);
		JOptionPane.showMessageDialog(null, "Seu IMC = " + imcS);
		
		String msg = (imc >= 20 && imc < 25) ? (imc + " esta no peso ideal!!!") : (imc + "está fora do peso!!!");
		System.out.println(msg);
		
		if (imc < 20){
				JOptionPane.showMessageDialog(null, imcS + " esta abaixo do peso");		
		}
		if (imc >= 20 && imc < 25){
				JOptionPane.showMessageDialog(null, imcS + " esta no peso ideal");		
		}
		if (imc >= 25 && imc < 30){
				JOptionPane.showMessageDialog(null, imcS + " esta em sobrepeso");		
		}
		if (imc >= 30 && imc < 35){
				JOptionPane.showMessageDialog(null, imcS + " esta em obesidade moderada");		
		}
		if (imc >= 35 && imc < 40){
				JOptionPane.showMessageDialog(null, imcS + " esta em obesidade severa");		
		}
		if (imc >= 40 && imc < 45){
				JOptionPane.showMessageDialog(null, imcS + " esta em obesidade morbida");		
		}
		if (imc >= 50){
				JOptionPane.showMessageDialog(null, imcS + " esta em super-obesidade");		
		}
	}

}