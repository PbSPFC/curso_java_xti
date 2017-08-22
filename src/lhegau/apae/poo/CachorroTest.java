package lhegau.apae.poo;
import java.util.Scanner;

public class CachorroTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Cachorro dog1 = new Cachorro();
		System.out.println("Digite a raça do cachorro: ");
		dog1.raca = input.nextLine();
		System.out.println("Digite o tamanho do cachorro: ");
		dog1.tamanho = input.nextInt();
		System.out.println("Digite o latido do cachorro: ");
		dog1.latido = input.nextLine();
		dog1.latido = input.nextLine();
		dog1.latir();
		
		Cachorro dog2 = new Cachorro();
		System.out.println("Digite a raça do cachorro: ");
		dog2.raca = input.nextLine();
		System.out.println("Digite o tamanho do cachorro: ");
		dog2.tamanho = input.nextInt();
		System.out.println("Digite o latido do cachorro: ");
		dog2.latido = input.nextLine();
		dog2.latido = input.nextLine();
		dog2.latir();
		
		
	}

}
