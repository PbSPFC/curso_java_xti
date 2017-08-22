package lhegau.apae.poo;

import java.util.Scanner;

public class MatematicaTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Matematica mate = new Matematica();
		
		System.out.print("Digite o primeiro número: ");
		int x1 = input.nextInt();
		String x2 = Integer.toString(x1);
		System.out.print("Digite o segundo número: ");
		int y1 = input.nextInt();
		String y2 = Integer.toString(y1);
		
		int maior = mate.maior(x1, y1);
		System.out.println("O maior número dos valores digitados é " + maior);
		
		int soma = mate.soma(x1, y1);
		System.out.println("A soma dos valores digitados é " + soma);
		
		System.out.println("A média dos valores digitados é " + mate.media(x1, y1));
		System.out.println("A média dos valores digitados é " + mate.media(x2, y2));

	}

}
