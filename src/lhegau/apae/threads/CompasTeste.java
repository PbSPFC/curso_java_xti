package lhegau.apae.threads;

import java.util.Scanner;

public class CompasTeste implements Runnable {

	ContaConjunta conta = new ContaConjunta();
	Scanner input = new Scanner(System.in);
	double valor;
	int vezes;
	
	public static void main(String[] args) {
		CompasTeste apae = new CompasTeste();
		
		System.out.print("Digite valor do saque: ");
		apae.valor = apae.input.nextDouble();
		System.out.print("Digite o numero de vezes: ");
		apae.vezes = apae.input.nextInt();
		
		
		new Thread(apae, "Compa Wey").start();
		new Thread(apae, "Ballon Aburrido").start();
		new Thread(apae, "Bolachinha Hehehhe").start();
		new Thread(apae, "Lagarto").start();
			
		
	}

	public void run() {
		String cliente = Thread.currentThread().getName();
		for(int cc = 0; cc < this.vezes; cc++ ){
		System.out.println(cliente + " estamos processando seu saque de " + this.valor);
		conta.sacar(this.valor, cliente);
		if (conta.getSaldo() <= 0){
			System.out.println("Seu saldo esta negativado!");
			}
		}
		
	}

}
