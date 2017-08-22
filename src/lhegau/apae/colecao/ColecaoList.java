package lhegau.apae.colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("Futeboll");
		list.add("Basquete");
		list.add("Tênis");
		list.add("Volei");
		list.add("Natação");
		list.add("Hockey");
		list.add("Boxe");
		System.out.println(list);
		
		for (int cc = 0; cc < list.size(); cc++){
			String x = list.get(cc);
			list.set(cc, x.toUpperCase());
		}
		System.out.println(list);
		System.out.println(list.indexOf("HOCKEY"));
		System.out.println(list.subList(2, 5));
		list.subList(2, 5).clear();
		System.out.println(list);
	}

}
