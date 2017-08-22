package lhegau.apae.logica;
public class Rotulo{

	public static void main(String[]args){
	
		boolean[][] matrix = {
			{false, true, false, false, false},
			{false, false, false, false, false}
		};
		
		apae:
		for (int a =0; a < matrix.length; a++){
			System.out.print("A, ");
			for (int b = 0; b < matrix.length; b++){
				if (matrix[a][b]){
					System.out.print("TRUE, ");
					break apae;
					}
				
				System.out.print("B, ");
				
			}
			
		}
		
		
	}

}