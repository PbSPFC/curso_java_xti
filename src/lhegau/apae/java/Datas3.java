package lhegau.apae.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(2012, Calendar.MAY, 20);
		Date date = c.getTime();
		
		Locale padrao = Locale.getDefault();
		Locale brasil = new Locale("pt","BR");
		Locale england = new Locale("en", "EN");
		Locale usa = Locale.US;
		Locale german = Locale.GERMANY;
		Locale jap = Locale.JAPAN;
		Locale ita = Locale.ITALY;
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, england);
		System.out.println(f.format(date));
		
		//f = DateFormat.getDateInstance(DateFormat.FULL, usa);
		//System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, german);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, jap);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, ita);
		System.out.println(f.format(date));
	}

}
