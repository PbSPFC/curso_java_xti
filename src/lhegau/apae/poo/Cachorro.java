package lhegau.apae.poo;

public class Cachorro {
	
	int tamanho;
	String raca;
	String latido;
	
	void latir(){
		System.out.println("Ra�a: " + raca);
		System.out.println("Tamanho: " + tamanho + "cm");
		System.out.println("Latido do " + raca + ": " + latido + "!");
	}
	
	
}
