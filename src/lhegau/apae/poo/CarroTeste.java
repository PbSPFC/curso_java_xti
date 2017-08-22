package lhegau.apae.poo;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Carro 1
		System.out.println("Digite o nome do modelo do carro: ");
		String modelo = input.nextLine();
		System.out.print("Digite a velocidade máxima do carro: ");
		int velo = input.nextInt();
		System.out.print("Digite em quantos segundos o carro chega a 100kmph: ");
		double km = input.nextDouble();
		System.out.print("Digite o tipo do motor do carro: ");
		String tipo = input.next();
		System.out.print("Digite a potência do motor do carro: ");
		int pot = input.nextInt();
		System.out.println("--------------------------------------------------");
		
		Carro carro1 = new Carro(modelo, velo, km, new Motor(tipo, pot));
		carro1.showCarro();		
			
		
		input.close();
	}

}
