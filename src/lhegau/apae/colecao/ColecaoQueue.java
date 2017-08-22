package lhegau.apae.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Metalzoa");
		fila.add("B. Skull Dragon");
		fila.add("Meteor B. Dragon");
		System.out.println(fila);
		
		System.out.println(fila.peek());
		System.out.println(fila.poll());//remove
		
		
		LinkedList<String> linklist = (LinkedList<String>) fila;
		linklist.add("Blue-Eyes White Dragon");
		linklist.add("Twin-Headed Thunder Dragon");
		System.out.println(linklist);
		
		System.out.println(linklist.peekFirst());
		System.out.println(linklist.peekLast());
		
		
		
	}

}
