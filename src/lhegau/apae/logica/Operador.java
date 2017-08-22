package lhegau.apae.logica;
import javax.swing.JOptionPane;

public class Operador{

	public static void main (String [] args){
	
	// 2 + 3 operador binário
	//-2 operador unítario
	//true ? "sim" : "não" operador ternário
	
	String a = JOptionPane.showInputDialog(null, "Digite o valor do raio: ");
	//String b = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");
	double x = Double.parseDouble(a);
	//double y = Double.parseDouble(b);
	
	
	double raio = x;
	double diametro = 2 * raio;
	System.out.println(diametro);
	String r1 = Double.toString(diametro);
	JOptionPane.showMessageDialog(null, "Diametro = " + diametro);
	
	
	
	double pi = Math.PI;
	double circunferencia = 2 * pi * raio;
	System.out.println(circunferencia);
	String r2 = Double.toString(circunferencia);
	JOptionPane.showMessageDialog(null, "Circunferencia = " + circunferencia);
	
	double area = pi * (raio * raio);
	System.out.println(area);
	String r3 = Double.toString(area);
	JOptionPane.showMessageDialog(null, "Area = " + area);
	
	
	//String idade = x >= 18 ? "Maior de idade" : "Menor de idade";
	
	//int soma = x + y;
	//String soma1 = Integer.toString(soma);
	//JOptionPane.showMessageDialog(null, x + " é " + idade);
	
	}

}