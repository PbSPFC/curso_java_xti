package lhegau.apae.poo;

public class Raiz {
	
	int raiz(int x){
		int raiz = 0;
		int impar = 1;
		
		while(x >= raiz){
			x = x - impar;
			impar += 2;
			raiz++;
			
		}		
		return raiz;
	}

}
