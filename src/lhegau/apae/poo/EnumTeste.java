package lhegau.apae.poo;

import java.util.Scanner;

public class EnumTeste {

	public static final double PI = 3.14;
	
	public static void andar(Medida medida, int total){
		if (medida == Medida.M){
			System.out.println("Você andou " + total + " " + Medida.M.titulo + "s.");
		}else if(medida == Medida.MM){
			System.out.println("Você andou " + total + " " + Medida.MM.titulo + "s.");
		}else {
			System.out.println("Você andou " + total + " " + Medida.CM.titulo + "s.");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(PecasXadrez.BISPO);
		System.out.println(Medida.MM.titulo);
		
		for (Medida m : Medida.values()){
			System.out.println(m + ": " + m.titulo);
		}
		
		System.out.print("Digite quantos metros você andou: ");
		int metros = input.nextInt();
		
		andar(Medida.M, metros);
		andar(Medida.CM, (metros * 10));
		andar(Medida.MM, (metros * 100));
	}

}
