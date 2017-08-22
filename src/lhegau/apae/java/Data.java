package lhegau.apae.java;

import java.util.Calendar;
import java.util.Date;

public class Data {

	public static void main(String[] args) {
		
		//01 Jan 1970
		//System.out.println(System.currentTimeMillis());
		
		Date agora = new Date();
		System.out.println(agora);
		
		Date dataAleatoria = new Date(1_379_002_000_000L);
		System.out.println(dataAleatoria);
		
		//Métodos
		
		dataAleatoria.getTime();
		dataAleatoria.setTime(1_379_002_000_000L);
		System.out.println(dataAleatoria.compareTo(agora));
		
		
		//Gregorian Calendar
		Calendar c = Calendar.getInstance();
		c.set(1995, Calendar.SEPTEMBER, 12);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//System.out.println(c.get(Calendar.DAY_OF_YEAR));
		//System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		c.set(Calendar.YEAR, 2012);
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		c.set(Calendar.DAY_OF_MONTH, 12);
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		c.set(Calendar.HOUR, 3);	
		
		c.add(Calendar.DAY_OF_MONTH, 1);
		//c.roll altera somente a unidade requisitada, exemplo: aumenta apenas os dias,
		//mesmo se os dias passarem de  31 o mês não será alterado
		System.out.println(c.getTime());
		
		//Saudação no horario
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		//hora += 10;
		System.out.println(hora);
		if(hora > 5 && hora <= 12){System.out.println("Bom dia!");}
		else if (hora > 12 && hora < 18){System.out.println("Boa tarde!");}
		else {System.out.println("Boa noite!");}
	}

}
