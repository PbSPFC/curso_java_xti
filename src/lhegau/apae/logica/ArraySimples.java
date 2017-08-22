package lhegau.apae.logica;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySimples{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		/*String imp = "";
		int[] impares = new int[5];
		for(int cc = 0; cc < 5; cc++){
			System.out.print("Digite o valor: ");
			impares[cc] = input.nextInt();
			if(cc==0){
				imp = ("" + impares[cc]);
				}else{
					imp = (imp + ", " + impares[cc]);
				}			
			
		}
		System.out.println(imp);
		*/
		
		String[] paises = {"Brasil", "Russia", "Italia", "Inglaterra", "Escocia"};
		//System.out.println(paises[0]);
		//System.out.println(paises.length);
		System.out.println(Arrays.toString(paises));
		//System.out.print("Digite o nome do pais: ");
		//String busca = input.nextLine();
		
		//int pos = Arrays.binarySearch(paises, busca);
		//System.out.println(pos);
		
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		Double[] valores = {12.35, 34.34};
		System.out.println(valores[0].doubleValue());
		
	}

}