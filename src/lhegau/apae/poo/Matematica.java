package lhegau.apae.poo;

public class Matematica {
	
	int maior(int x, int y){
		if (x > y){return x;}
		else{return y;}
	}
	
	int soma(int ... x){
		int total = 0;
		for (int n : x){
			total += n;
		}
		return total;
	}
	
	public int media(int x, int y){
		System.out.println("APAE");
		return (x + y) /2;
	}
	
	public double media(String x, String y){
		System.out.println("APAE2");
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		return (x1 + y1) / 2;
	}
	
}
