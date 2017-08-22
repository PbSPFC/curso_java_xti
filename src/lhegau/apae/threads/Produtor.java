package lhegau.apae.threads;

import java.util.Random;

public class Produtor implements Runnable {

	private Ponte ponte;
	private Random random = new Random();
	public Produtor(Ponte objeto){
		this.ponte = objeto;
	}
	
	public void run() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			int r;
			do{r = random.nextInt(3000);}while(r < 1000);
			try{
				Thread.sleep(r);
				ponte.set(i);
				total += i;
				System.out.println("\tTotal: " + total);
			}catch(InterruptedException e){}
		}
		
		
	}

}
