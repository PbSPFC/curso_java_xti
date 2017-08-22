package facul;

import java.util.Calendar;
import java.util.Date;



public class Teste {
	
	public static String hora(Calendar h){
		String x = h.get(Calendar.HOUR_OF_DAY) 
		+ ":" + h.get(Calendar.MINUTE) + ":" + h.get(Calendar.SECOND);
		
		return x;
	}
	
	public static void main(String[] args) {
		
		Calendar day = Calendar.getInstance();
		//System.out.println(day.getTime());

		Calendar hora = Calendar.getInstance();
		//System.out.println(hora(hora));
		Date h = new Date();
		
		String teste = null;
		StringBuilder s1 = new StringBuilder("asdasdasdasdasdasdasdasdas   PEru\n");
        s1.deleteCharAt(s1.length()-1);
        s1.toString();
        teste = s1.toString();
        System.out.println(teste);
        System.out.println(teste);
        
        
        String filename= "c:\\abc.txt";

        String fileArray[]=filename.split("\\.");

        System.out.println(fileArray[fileArray.length-1]);
		
	}

}
