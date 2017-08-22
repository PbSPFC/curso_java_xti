package lhegau.apae.poo;

import java.util.Scanner;

public class GalinhaTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ovo, ngalinha = 0;
		//Galinha 1
		Galinha g1 = new Galinha();
		ngalinha++;
		System.out.print("Quantos ovos a primeira galinha botou: ");
		ovo = input.nextInt();
		for(int cc = 0; cc < ovo; cc++){g1.botar();}
		//Galinha 2
		Galinha g2 = new Galinha();
		ngalinha++;
		System.out.print("Quantos ovos a segunda galinha botou: ");
		ovo = input.nextInt();
		for(int cc = 0; cc < ovo; cc++){g2.botar();}
		System.out.println("--------------------------------------------------");
		//-----
		System.out.println("A primeira galinha botou " + g1.ovos + " ovos");
		System.out.println("A segunda galinha botou " + g2.ovos + " ovos");
		System.out.println("A granja tem " + ngalinha + " galinha(s)");
		if(Galinha.ovosDaGranja == 1){System.out.println("A granja tem apenas 1 ovo estocado.");}
		else if (Galinha.ovosDaGranja == 0){System.out.println("A granja não tem nenhum ovo estocado.");}
		else {System.out.println("O total de ovos na granja é de " + Galinha.ovosDaGranja + " ovos." );}
		
		System.out.println("A média de ovos por galinha na granja é de " + Galinha.mediaOvosGranja(ngalinha));
	}

}
