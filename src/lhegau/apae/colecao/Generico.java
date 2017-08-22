package lhegau.apae.colecao;

import java.util.ArrayList;

public class Generico<E> {
	
	E elemento;
	
	public void setElemento(E elemento){
		this.elemento = elemento;
	}
	public E getElemento(){
		return elemento;
	}
	
	public double soma(ArrayList<? extends Number> x){//caractere coringa
		double total = 0;
		for (Number number : x) {
			total += number.doubleValue();
		}
		return total;
	}
	
	public static void main(String[] args) {
		Generico<String> g = new Generico<>();
		g.setElemento("B. Skull Dragon");
		//g.setElemento(123);
		System.out.println(g.getElemento().toUpperCase());
		
	}

}
