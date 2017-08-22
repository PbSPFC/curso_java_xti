package lhegau.apae.logica;
import java.util.Scanner;


public class Fibonacci{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int[] fibo = new int[3];
		
		System.out.println("Bem vindo! Este programa realizara uma conta Fibonacci.");
		System.out.print("Digite o primeiro valor: ");
		fibo[0] = input.nextInt();
		System.out.print("Digite o segundo valor: ");
		fibo[1] = input.nextInt();
		fibo[2] = fibo[0] + fibo[1];	
		
		System.out.println("");
		
		while (fibo[2] < 500){
			
			System.out.println(fibo[0] + " + " + fibo[1] + " = [" + fibo[2] + "]");	
			
			fibo[0] = fibo[1];
			fibo[1] = fibo[2];
			fibo[2] = fibo[0] + fibo[1];
				
		
			System.out.println("--------------------------------------------------");
			
		}
	
	}

}