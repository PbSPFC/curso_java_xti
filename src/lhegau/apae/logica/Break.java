package lhegau.apae.logica;
import java.util.Scanner;

public class Break {

	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int n = input.nextInt();
		String n1 = "";
		/*while (true){
			System.out.println("Hello");
			break;
		}*/
		
		for (int i = 0; i <= n; i++){
			
			if (!((i % 2) == 0)){
				continue;
			}
			
			if (i == n){ n1 = n1 + i + ".";}
			else {n1 = n1 + i + ", ";}
			
		}
		System.out.println(n1);
	}


}