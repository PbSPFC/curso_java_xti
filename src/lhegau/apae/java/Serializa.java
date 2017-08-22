package lhegau.apae.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import lhegau.apae.poo.Conta;

public class Serializa {

	public static void main(String[] args) throws Exception {
		String[] nomes = {"APAE" , "GOEC", "Lagarto"};
		Scanner input = new Scanner(System.in);
		//Modificador transient serve para proteger variaveis de serialização, por exemplo: senha não é exposta
		System.out.println("Digite o nome do cliente: ");
		String x = input.next();
		System.out.println("Digite o saldo do cliente: ");
		double y = input.nextDouble();
		Conta conta1 = new Conta(x, y);
		
		
		//Escrita de objetos
		
		FileOutputStream fos = new FileOutputStream("C:/lhegau/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//oos.writeObject(nomes);
		oos.writeObject(conta1);
		oos.close();
		
		//Leitura de objetos
		FileInputStream fis = new FileInputStream("C:/lhegau/files/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//String[] nomes1 = (String[]) ois.readObject();
		Conta c1 = (Conta) ois.readObject();
		ois.close();
		
		c1.exibeSaldo();
		//System.out.println(Arrays.toString(nomes1));
		
	}

}
