package lhegau.apae.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExpressaoRegular {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//(?i)ignora CaseSensitive
		//(?x)Comentarios
		//(?m)Multilinhas
		//(?s)Dottal
		System.out.print("Digite o texto de busca: ");
		boolean v = "APAE".matches(("(?i)" + input.next())); //(?1) ignora o CaseSensitive
		System.out.println(v);
		
		//Metacaracteres
		// . qualquer digito
		// \d digitos [0-9]
		// \D não é digito [0-9]
		// \s espaços  
		// \S não é espaço
		// \w letra
		// \W não é letra
		/*System.out.print("Qualquer digito: ");
		v = "@".matches(".");
		System.out.println(v);
		
		System.out.print("Digitos de 0 a 9: ");
		v = "1".matches("\\d");
		System.out.println(v);
		
		System.out.print("Qualquer letra: ");
		v = "A".matches("\\w");
		System.out.println(v);
		
		System.out.print("Espaços: ");
		v = " ".matches("\\s");
		System.out.println(v);
		*/
		
		
		System.out.print("Digite no minimo 2 e no máximo 5 numeros: ");
		//v = input.next().matches("\\d{2,}");
		//v = input.next().matches("\\d{2,5}");
		
		v = "".matches(".?");// 0 ou 1
		
		v = "".matches(".*");//0 ou +
		
		v = "".matches(".1");//1 ou +
		
		System.out.print("Digite seu cep: ");
		v = input.next().matches("\\d{5}-\\d{3}");
		System.out.println(v);
		
		System.out.print("Digite sua data de nascimento: ");
		v = input.next().matches("\\d{2}/\\d{2}/\\d{2,4}");
		System.out.println(v);
		
		v = "Pier21".matches("^Pier.*");//^ inicio
		v = "Pier21".matches(".*21$");//$ fim
		v = "Tem java aqui".matches(".*java.*");//procura no meio
		v = "sim".matches("sim|nao");// | ou
		
		//agrupadores
		
		v = "x".matches("[a-z]");
		v = "2".matches("[0-9]");
		v = "True".matches("[tT]rue");
		v = "Yes".matches("[tT]rue|[yY]es");
		v = "Lagarto".matches("[A-Z][a-zA-Z]*");
		v = "Lagarto".matches("L[^o]garto");
		v = "Lagorto".matches("L[ao]g[ao]rto");
		v = "apae@goec.com".matches("\\w+@\\w+\\.com");//validação de email
		System.out.println(v);
		
		String xx = "O Peru com peru do PeRu";
		Matcher matcher = Pattern.compile("(?i)peru").matcher(xx);
		while(matcher.find()){
			//System.out.println(matcher.group());
		}
		
		//substituições
		
		String r = xx.replaceAll("(?i)peru", "Lagarto");
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "**");
		r = "Tabular este texto".replaceAll("\\s", "\t");
		System.out.println(r);
		
		String url = "www.xti.com.br/clientes-2011.html";
		
		String re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		v = url.matches(re);
		
		//System.out.println(v);
		
		r = url.replaceAll(re, "http://$1/$3/$2.jps");
		System.out.println(r);
	}

}
