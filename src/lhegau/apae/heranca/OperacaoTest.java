package lhegau.apae.heranca;

public class OperacaoTest {

	public static void calcule(OperacaoMatematica o, double x, double y){
		System.out.println(o.calcular(x, y));
	}
	
	public static void main(String[] args) {
		Soma s = new Soma();
		calcule(s, 5, 5);
		calcule(new Multiplicacao(), 5, 5);
		
		
	}

}
