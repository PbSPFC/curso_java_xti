package lhegau.apae.threads;

public class PonteNaoSincronizada implements Ponte{
	
	int valor = -1;
	
	
	public void set(int valor) throws InterruptedException {
		System.out.print("Produziu " + valor);
		this.valor = valor;
	}

	@Override
	public int get() throws InterruptedException {
		System.err.print("Consumiu " + valor);
		return valor;
	}

}
