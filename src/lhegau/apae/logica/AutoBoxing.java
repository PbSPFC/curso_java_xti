package lhegau.apae.logica;
public class AutoBoxing {

	public static void main(String[]args){
		//Versão antes do 5.0 do java
		Integer x = new Integer(665); //empacotado
		int a = x.intValue(); //desempacotar
		a++; //incrementa
		x = new Integer(a); //re-empacotar
		System.out.println("Valor de x = " + x.intValue());
		
		
		//Versão pós 5.0 do java
		Integer y = 665;
		y++; //desempacotou, incrementou, reempacotou tudo de uma vez só
		System.out.println("Lagarto" + y);
	
	}

}