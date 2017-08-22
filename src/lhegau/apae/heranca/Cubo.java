package lhegau.apae.heranca;

public class Cubo implements AreaCalculavel, VolumeCalculavel{

	double lado;
	public Cubo(double x){
		this.lado = x;
	}
	
	
	public double calcularVolume() {
		return 6 * lado * lado;
	}

	public double calculeArea() {
		
		return lado * lado * lado;
	}

	
	
	
	
}
