package lhegau.apae.threads;

import java.util.Scanner;

public class PingPongRunnable implements Runnable {
	
	String palavra;
	long tempo;
	int x;
	public PingPongRunnable(String palavra, long tempo, int x){
		this.palavra = palavra;	
		this.tempo = tempo;
		this.x = x;
	}
	
	public void run(){
		try{
			for(int cc = 0; cc < x; cc++){
				System.out.println(palavra + " - Replay: " + (cc + 1));
				Thread.sleep(tempo);
			}
		}catch(InterruptedException e){
			return;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número para repetição: ");
		int x = input.nextInt();
		
		Runnable run1 = new PingPongRunnable("Peru!", 1500, x);
		Runnable run2 = new PingPongRunnable("Lagartao voltou!", 3000, x);
		
		new Thread(run1).start();
		new Thread(run2).start();
		
		
		System.out.println("Mission Start!");

	}

}
