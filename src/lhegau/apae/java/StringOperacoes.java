package lhegau.apae.java;

import javax.swing.JOptionPane;

public class StringOperacoes {

	public static void main(String[] args) {

		String s1 = "APAE";
		String s2 = s1 + " GOEC";
		String s3 = new String("PERU");
		char[] array = {'C', 'h', 'a', 'v', 'e', 's'};
		String s4 = new String(array);
		
		//OPERAÇÕES
		int tamanho = s1.length();
		char letra = s1.charAt(0);
		String texto = s1.toString();
		
		//LOCALIZAÇÃO
		int posicao = s4.indexOf("ves");
		int lastp = s1.lastIndexOf('a');
		boolean vazia = s3.isEmpty();
		
		//COMPARAÇÃO
		String apae = "apae";
		//boolean igual = apae.equalsIgnoreCase(s1);
		//boolean igual = apae.startsWith("A");
		//int comp = s1.compareTo(s2);
		
		//System.out.println(comp);
		
		//String so = "Olha, olhe!";
		//boolean aaa = so.regionMatches(6, "Olhe", 0, 4);
		String l = "O Brasil é Peruuu";
		//String sl = l.substring(11);
		String sl = l.substring(2, 8);
		//sl = l.concat("Peruuuu");//sl += "Peru";
		sl = l.replace('P', 'M');
		//replaceFirst, replaceAll
		sl = l.toUpperCase();//toLowerCase
		//trim() 'Remove os espaços inutilizados'
		
		System.out.println(sl);
		
		
		
		
		/* 
		*JOptionPane.showMessageDialog(null, s1);
		*JOptionPane.showMessageDialog(null, s2);
		*JOptionPane.showMessageDialog(null, s3);
		*JOptionPane.showMessageDialog(null, s4);
		*/
	}

}
