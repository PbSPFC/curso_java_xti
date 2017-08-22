package lhegau.apae.poo;

public class Galinha {
	
	public static int ovosDaGranja;
	
	public int ovos;
	
	public void botar(){
		this.ovos++;
		Galinha.ovosDaGranja++;
	}
	
	public static double mediaOvosGranja (int galinhas){
		return (Galinha.ovosDaGranja / galinhas);
	}
	
}
