package lhegau.apae.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {

		Map<String, String> card = new HashMap<>();
		card.put("217", "B. Skull Dragon");
		card.put("001", "Blue-Eyes White Dragon");
		card.put("722", "Meteor B. Dragon");
		card.put("437", "Metalzoa");
		card.put("067", "Perfectly Ultimate Great Moth");
		System.out.println(card);
		
		System.out.println(card.containsKey("067"));
		System.out.println(card.containsValue("Perfectly Ultimate Great Moth"));
		System.out.println(card.get("217"));
		card.remove("437");
		
		System.out.println(card);
		
		Set<String> keys = card.keySet();
		for (String x : keys) {
			System.out.println(x + " | " + card.get(x));
		}
		

	}

}
