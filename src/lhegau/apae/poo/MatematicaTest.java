package lhegau.apae.poo;

import java.util.Scanner;

public class MatematicaTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Matematica mate = new Matematica();
		
		System.out.print("Digite o primeiro n�mero: ");
		int x1 = input.nextInt();
		String x2 = Integer.toString(x1);
		System.out.print("Digite o segundo n�mero: ");
		int y1 = input.nextInt();
		String y2 = Integer.toString(y1);
		
		int maior = mate.maior(x1, y1);
		System.out.println("O maior n�mero dos valores digitados � " + maior);
		
		int soma = mate.soma(x1, y1);
		System.out.println("A soma dos valores digitados � " + soma);
		
		System.out.println("A m�dia dos valores digitados � " + mate.media(x1, y1));
		System.out.println("A m�dia dos valores digitados � " + mate.media(x2, y2));

	}

}
