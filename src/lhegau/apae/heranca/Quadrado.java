package lhegau.apae.heranca;

public class Quadrado implements AreaCalculavel{
	
	double lado;
	public Quadrado(double x){
		this.lado = x;
	}
	
	
	public double calculeArea() {
		return lado * lado;
	}

}
