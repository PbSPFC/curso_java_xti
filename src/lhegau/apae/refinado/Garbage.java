package lhegau.apae.refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {
	
	public static long sobrecarregarMemoria(){
		
		List<Integer> apae = new ArrayList<Integer>();
		for(int cc = 0; cc < 100_000; cc++){
			apae.add(cc);
		}
		return Runtime.getRuntime().freeMemory();
	}

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		final int MB = 1_048_576;//Tamanho de MB em bytes
		double total = rt.maxMemory() / MB;
		double inicio = total - (sobrecarregarMemoria() / MB);
		
		System.out.println("Mem�ria total: " + total + "MB");
		System.out.println("Mem�ria livre: " + inicio + "MB");
		
		rt.runFinalization();//Limpa toda a mem�ria que for poss�vel!
		rt.gc();
		
		double fim = total - (rt.freeMemory() / MB);
		
		System.out.println("Mem�rial final: " + fim);
		
	}

}
