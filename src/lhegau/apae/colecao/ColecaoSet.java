package lhegau.apae.colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		String[] deck = {"B.Skull Dragon", "Perfeclty Ultimate Great Moth", "Meteor B. Dragon",
							"Metalzoa", "B.Skull Dragon", "Perfeclty Ultimate Great Moth"};
		List<String> list = Arrays.asList(deck);
		System.out.println(list);
		
		Set<String> set = new HashSet<>(list);
		System.out.println(set);
		

	}

}
