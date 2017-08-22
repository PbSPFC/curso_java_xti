package lhegau.apae.java;

public class StringMutavel {

	public static void main(String[] args) {
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("APAE");
		
		s1.toString();
		s1.length();
		s1.capacity();//mostra a capacidade de memoria do objeto "s1"
		//s1.reverse();//faz o espelhamento do texto dentro de s1
		s1.append(" trabalha de bar");//concatena a string s1
		System.out.println(s1);
		
		String url = new StringBuilder("peru apae goec").delete(0, 5).toString();
		System.out.println(url);
	}

}
