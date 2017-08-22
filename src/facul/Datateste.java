package facul;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datateste {
	
	public static String getDate(){
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return sdf.format(data).toString() + " " + c.get(Calendar.HOUR_OF_DAY) + ":" + 
		c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND);
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(getDate());
	}

	
	
}
