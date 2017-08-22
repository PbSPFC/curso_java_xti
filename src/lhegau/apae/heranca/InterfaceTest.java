package lhegau.apae.heranca;

public class InterfaceTest {

	public static void area(AreaCalculavel x){
		System.out.println(x.calculeArea());
	}
	
	public static void volume(VolumeCalculavel x){
		System.out.println(x.calcularVolume());
	}
	
	
	public static void main(String[] args) {
		area(new Quadrado(5));
		area(new Cubo(10));
		volume(new Cubo(10));
	}

}
