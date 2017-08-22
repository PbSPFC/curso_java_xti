package lhegau.apae.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {

		Calendar c = Calendar.getInstance();
		c.set(2012, Calendar.SEPTEMBER, 12);
		Date date = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));
		
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
		//Estilos de formatação
		
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(date));
		
		Date data2 = f.parse("12/09/2013");
		System.out.println(data2);


		//Simple Date Format
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(data2));
		System.out.println(sdf.parse("10/10/2012"));
		
	}

}
