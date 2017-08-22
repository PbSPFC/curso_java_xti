package lhegau.apae.threads;

public class PonteSincronizada implements Ponte{

	private int valor = -1;
	private boolean ocupada = false;
	
	public synchronized void set(int valor) throws InterruptedException {
		while(ocupada){
			System.out.println("Ponte ocupada, aguardar processo...\n");
			wait();
		}
		
		System.out.print("Produziu " + valor);
		this.valor = valor;
		ocupada = true;
		notifyAll();
	}

	
	public synchronized int get() throws InterruptedException {
		while(!ocupada){
			System.err.println("Ponte vazia, aguardar processo...\n");
			wait();
		}
		
		System.err.print("Consumiu " + valor);
		ocupada = false;
		notifyAll();
		return valor;
		
	}

}
