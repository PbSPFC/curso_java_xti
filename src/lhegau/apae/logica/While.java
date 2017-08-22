package lhegau.apae.logica;
import java.util.ArrayList;
import java.util.Scanner;


public class While {

	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		ArrayList<String> produtos = new ArrayList<String>();
		ArrayList<Double> precos = new ArrayList<Double>();
		String p = "";
		Double preco;
		
		System.out.println("Liste seus produtos (Para sair digite [FIM]): ");
		System.out.println("------------------------------");
		
		while (!"FIM".equals(p)){
			
			System.out.println("Digite o nome do produto: ");
			
			p = input.nextLine();
			p = input.nextLine();
			
			
			
			if ("FIM".equals(p)){}
			else{
			produtos.add(p);
			
			System.out.println("Digite o preco de " + p + ": ");
			preco = input.nextDouble();
			precos.add(preco);
			
			System.out.println("------------------------------");
			}
			
			
		}
		System.out.println(produtos.toString());
		System.out.println(precos.toString());
	}

}