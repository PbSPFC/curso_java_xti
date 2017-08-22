package lhegau.apae.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao0 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("B");
		c.add("C");
		
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("B"));
		//System.out.println(c.toString());
		//c.remove("A");
		//System.out.println(c.toString());
		
		Collection<String> c2 = Arrays.asList("Peru", "Lagarto");
		c.addAll(c2);//Coleção C vai receber o conteudo de coleção C2
		
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2));
		c.removeAll(c2);
		System.out.println(c.toString());
		
		
		//percorrer os elementos
		for (String x : c) {
			System.out.println(x);
		}
		
		//converter coleção para array
		String[] s = c2.toArray(new String[c2.size()]);
		
		System.out.println(Arrays.toString(s));
		c.clear();
		System.out.println(c.toString());
		
	}

}
