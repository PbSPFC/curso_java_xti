package lhegau.apae.logica;
import java.util.Scanner;
import java.util.Random;


public class Dado{

	public static void main (String [] args){
	
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int dado = random.nextInt(6) + 1;
		System.out.println("Bem vindo, este programa ira simular dois dados virtuais, \nonde voce fara um palpite e vamos conferir se o valor dos dados sera o mesmo do seu palpite. \nBoa Sorte!!!");
		System.out.println("\n-------------------------\n");
		System.out.print("Digite o valor do seu palpite [1/6]: ");
		int palpite = input.nextInt();
		if (palpite < 1){palpite = 1;}
		if (palpite > 6){palpite = 6;}
		
		System.out.println("\n------------------------- Processando -------------------------\n");
		System.out.println("O dado caiu no valor " + dado + " e seu palpite foi " + palpite + ".");
		if (palpite == dado){System.out.println("Parabens, seu palpite foi certeiro, voce tem sorte!!!");}
		else {System.out.println("Que pena, parece que seu palpite foi errado, tente outra vez!");}
	
	
	}

}