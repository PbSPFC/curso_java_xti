package lhegau.apae.java;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;

public class Sistemas {

	public static void main(String[] args) throws IOException {
		Properties p = System.getProperties();
		System.out.println("Versão do java: " + p.getProperty("java.version"));
		p.setProperty("lhegau.apae.java.version", "1.0.0");
		
		/*Set<Object> pk = p.keySet();
		for (Object key : pk) {
			System.out.println(key + " = " + p.get(key));
		}*/
		
		
		/*Console c = System.console();
		System.out.print("User: ");
		String user = c.readLine();
		System.out.print("Password: ");
		char[] pass = c.readPassword();
		
		System.out.println("User " + user + " your password is " + new String(pass) + ".");
		*/
		
		Runtime.getRuntime().exec("notepad");
		
		
	}

}
