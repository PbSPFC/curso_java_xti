package lhegau.apae.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import lhegau.apae.poo.Conta;

public class Serializa2 {

	Scanner input = new Scanner(System.in);
	
	public void preencheConta(ArrayList<Conta> x){
		String sim = "S", cliente;
		double saldo;
		boolean cont = false;

		do {
			System.out.println("Digite o nome do cliente: ");
			cliente = input.nextLine();
			System.out.println("Digite o saldo do cliente: ");
			saldo = input.nextDouble();
			x.add(new Conta(cliente, saldo));

			System.out.println("Deseja criar outra conta? Digite [S] para criar uma nova conta: ");
			sim = input.nextLine();
			sim = input.nextLine();
			if (!(sim.equals("S"))) {
				cont = true;
			}
		} while (cont == false);
	}
	
	public void criaConta(ArrayList<Conta> x) throws IOException {
		try(FileOutputStream fos = new FileOutputStream("C:/lhegau/files/contasSer.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(x);
			}
		}
	}
	
	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
		try(FileInputStream fis = new FileInputStream("C:/lhegau/files/contasSer.ser")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
			return (ArrayList<Conta>) ois.readObject();	
			}
		}
		
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Serializa2 operacao = new Serializa2();
		
		contas = operacao.recuperarContas();
		
		//operacao.preencheConta(contas);
		
		//operacao.criaConta(contas);
		
		contas = operacao.recuperarContas();
		for (Conta conta : contas) {
			conta.exibeSaldo();
		}
	}

}
