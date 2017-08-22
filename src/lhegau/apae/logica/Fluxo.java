package lhegau.apae.logica;
import java.util.Scanner;

public class Fluxo {

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		/*System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
	
		if (idade < 16){System.out.println("Voce tem " + idade + " anos e nao pode votar");}
		else if ((idade >= 16 && idade <18) || (idade >= 70 )) {System.out.println("Voce tem " + idade + " anos e sua votacao e opcional");}
		else {System.out.println("Voce tem " + idade + " anos e sua votacao e obrigatoria!");}
		*/
		System.out.println("Digite o nome do seu time: ");
		String time = input.nextLine();
		
		
		switch (time){
			case "Sao Paulo":
			case "Santos":
			System.out.println("Seu time e o " + time + " e ele tem 3 titulos da Copa Libertadores da America");
			break;
			case "Cruzeiro":
			case "Internacional":
			System.out.println("Seu time e o " + time + " e ele tem 2 titulos da Copa Libertadores da America");
			break;
			case "Gremio":
			case "Corinthians":
			case "Palmeiras":
			System.out.println("Seu time e o " + time + " e ele tem 1 titulo da Copa Libertadores da America");
			break;
			default:
			System.out.println("Seu time e o " + time + " e ele nao tem titulos da Copa Libertadores da America");
			break;
		}
		
		
	}

}