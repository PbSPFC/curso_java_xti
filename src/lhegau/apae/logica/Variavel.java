package lhegau.apae.logica;
/** Apresentar os conceitos de variável
*
*
*/
public class Variavel {

	public static void main (String[]args){
		
		String nome = "Apae";
		int idade = 20;
		boolean lhegau = true;
		
		System.out.println("\"APAE GOEC\"");
		System.out.println("-------------------------");
		System.out.println(nome + ";");
		System.out.println(idade + " anos;");
		System.out.println("Lhegau: \"" + true + "\".");
		System.out.println("-------------------------");
		
		byte b = 127; //aprox. cem
		short s = 32767; //aprox. 32 mil
		int i = 20000000; //aprox. 2 milhões
		long l = 9000L;//aprox. 9 quinquilhões
		double d = 1.7; //IEEE 754
		float f = 123F;
		
		i = s; //Cast implícito é quando convertemos um tipo primitivo de menos bits para outro com mais bits
		System.out.println(s);
		System.out.println(i);
		System.out.println("-------------------------");
		
		i = (int) l; //Cast explicíto é quando convertemos um tipo primitivo de mais bits para outro com menos bits
		System.out.println(s);
		System.out.println(i);
		System.out.println("-------------------------");
		
		
		byte bb = 0b01010101; //0b para representar o número em código binário /8bits = 1byte
		short ss = 0b0001010101010101;//16 bits = 2bytes
		int ii = 0b01010101010101010101010101010101;//32 bits = 4bytes
		
		System.out.println(bb + ";\n" + ss + ";\n" + ii + ".");
		
		final double PI = 3.1415926535589793;
		
		System.out.println(PI);
		
		Double preco = new Double("12.45");
		double ddd = preco.doubleValue();
		int iii = preco.intValue();
		byte bbb = preco.byteValue();
		Boolean casado1 = new Boolean("yes");
		
		//conversão estática
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		
		int i2 = Integer.valueOf("101011", 2);
		System.out.println(i2);
		
	}


}