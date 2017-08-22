package lhegau.apae.logica;
import java.util.Random;
import java.util.ArrayList;

public class ArrayMulti{

	public static void main(String[] args){
		
		ArrayList<String> cores = new ArrayList<String>();
		cores.add(0, "Branco");
		cores.add(1, "Vermelho");
		cores.add("Azul");
		cores.add(2, "Preto");
		
		System.out.println(cores.toString());
		System.out.println("Tamanho: " + cores.size());
		System.out.println("Elemento 3: " + cores.get(2));
		System.out.println("Elemento vermelho: " + cores.indexOf("Vermelho"));
		cores.remove("Branco");
		System.out.println(cores.toString());
		System.out.println("Tienes Azul? " + cores.contains("Azul"));
		
		
		
		/*Random r = new Random();
		
		
		String[] faces = {"As","2","3","4","5","6","7","8","9", "10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Ouros", "Espadas", "Copas", "Paus"};
		
		int x = r.nextInt(faces.length);
		int y = r.nextInt(nipes.length);
		String carta = (faces[x] + " de " + nipes[y]);
		
		System.out.println(carta);
		*/
		
	}

}