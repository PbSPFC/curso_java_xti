package lhegau.apae.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maçã");
		list.add("Pessêgo");
		list.add("Morgango");
		list.add("Uva");
		list.add("Pêra");
		list.add("Banana");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.addAll(list, "Abacaxi", "Laranja", "Manga", "Maçã");
		
		Collections.shuffle(list);
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "Maçã"));
		
		List<String> list2 = Arrays.asList("Peru", "Lagarto");
		boolean d = Collections.disjoint(list, list2);
		
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Pêra");
		System.out.println(indice);
		System.out.println(list);
		
		//Collections.fill(list, "Peru!");
		//System.out.println(list);
		
		Collection<String> constante = Collections.unmodifiableCollection(list);
		System.out.println(constante);
		
		
	}

}
