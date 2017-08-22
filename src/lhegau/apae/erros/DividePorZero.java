package lhegau.apae.erros;

import java.util.InputMismatchException;
import java.util.Scanner;



public class DividePorZero {
	
	public static void dividir(Scanner input) throws InputMismatchException, ArithmeticException
	{
		System.out.println("Digite o primeiro valor: ");
			int a = input.nextInt();
			System.out.println("Digite o segundo valor: ");
			int b = input.nextInt();
			System.out.println("A divis�o dos n�mero informados �: " + (a / b));

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continua = true;	
		int replay = 0;
		
		do{
			try{
			
			dividir(input);
			
			continua = false;
			}
			catch (InputMismatchException | ArithmeticException error1){
				System.err.println("Valor inv�lido.\n");
				error1.printStackTrace();
				input.nextLine();
			}
			finally {
				replay++;
				System.err.println("Replays: " + replay + "\n");
			}
		}while(continua);
	}

}
