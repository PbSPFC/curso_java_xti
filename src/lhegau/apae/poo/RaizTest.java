package lhegau.apae.poo;

import java.util.Scanner;

public class RaizTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Raiz r = new Raiz();
		
		System.out.print("Digite o número para calcular a raíz: ");
		int x = input.nextInt();
		int y = r.raiz(x);
		System.out.println("A raíz quadrada de " + x + " arredondada é " + y);
		System.out.println("A raíz quadrada de " + x + " precisamente é " + Math.sqrt(x));

	}

}
