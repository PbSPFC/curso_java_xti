package lhegau.apae.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {
		
		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance();
		f.setMaximumFractionDigits(2);
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));
		
		
		//Internacionaliza��o
		
		
		f = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(f.format(saldo));
		
		
		//Convers�o
		
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.parse("R$ 1.100,25"));
	}

}
