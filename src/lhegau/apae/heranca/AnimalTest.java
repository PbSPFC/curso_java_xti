package lhegau.apae.heranca;

import java.util.Scanner;

public class AnimalTest {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Cachorro1
		System.out.print("Digite o peso do cachorro: ");
		double peso = input.nextDouble();
		System.out.println("Digite o tipo de comida do cachorro: ");
		String comida = input.nextLine();
		comida = input.nextLine();
		System.out.println("Digite como é o barulho do cachorro enquanto dorme: ");
		String ronco = input.nextLine();
		System.out.println("Digite o barulho que o cachorro faz: ");
		String fala = input.nextLine();
		Animal dog1 = new Cachorro(peso, comida, ronco, fala);
		//Galinha1	
		System.out.print("\nDigite o peso da galinha: ");
		peso = input.nextDouble();
		System.out.println("Digite o tipo de comida da galinha: ");
		comida = input.nextLine();
		comida = input.nextLine();
		System.out.println("Digite como é o barulho da galinha enquanto dorme: ");
		ronco = input.nextLine();
		System.out.println("Digite o barulho que a galinha faz: ");
		fala = input.nextLine();
		Animal pollo1 = new Galinha(peso, comida, ronco, fala);
		
		
		System.out.println("\nPeso do cachorro: " + dog1.peso);
		System.out.println("Comida do cachorro: " + dog1.comida);
		dog1.dormir(dog1.ronco);
		dog1.fazerBarulho(dog1.fala);
		
		
		System.out.println("\nPeso da galinha: " + pollo1.peso);
		System.out.println("Comida da galinha: " + pollo1.comida);
		pollo1.dormir(pollo1.ronco);
		pollo1.fazerBarulho(pollo1.fala);
		
		
		
		
		
		
		input.close();
	}

}
