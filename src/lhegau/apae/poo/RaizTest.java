package lhegau.apae.poo;

import java.util.Scanner;

public class RaizTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Raiz r = new Raiz();
		
		System.out.print("Digite o n�mero para calcular a ra�z: ");
		int x = input.nextInt();
		int y = r.raiz(x);
		System.out.println("A ra�z quadrada de " + x + " arredondada � " + y);
		System.out.println("A ra�z quadrada de " + x + " precisamente � " + Math.sqrt(x));

	}

}
