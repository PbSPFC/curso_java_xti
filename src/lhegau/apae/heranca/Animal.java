package lhegau.apae.heranca;

public class Animal {
	
	double peso;
	String comida, ronco, fala;
	
	
	public Animal(double peso, String comida, String ronco, String fala){
		this.peso = peso;
		this.comida = comida;
		this.ronco = ronco;
		this.fala = fala;
	}
	
	void dormir(String dormir){
		System.out.println("Dormindo: " + dormir);
	}
	void fazerBarulho(String barulho){
		System.out.println(barulho + "!");
	}
	
	
}
