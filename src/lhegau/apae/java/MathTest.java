package lhegau.apae.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat f = NumberFormat.getInstance();
		f.setMaximumFractionDigits(2);
		System.out.print("Digite um número: ");
		int x = input.nextInt();
		
		
		System.out.println("Seno: " + f.format(Math.sin(x)));
		System.out.println("Cosseno: " + f.format(Math.cos(x)));
		System.out.println("Tangente: " + f.format(Math.tan(x)));
		System.out.println("Potencia '2': " + f.format(Math.pow(x, 2)));
		System.out.println("Raiz Quadrada: " + f.format(Math.sqrt(x)));
		System.out.println("Raiz Cúbica: " + f.format(Math.cbrt(x)));
		System.out.println("Hypotenusa: " + f.format(Math.hypot(x, x)));

	}

}
