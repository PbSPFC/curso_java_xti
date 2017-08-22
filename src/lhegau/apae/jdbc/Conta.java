package lhegau.apae.jdbc;

public class Conta {

	int numero;
	String cliente;
	double saldo;
	
	public Conta(){}
	public Conta(int numero, String cliente, double saldo){
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String toString(){
		return ("Número da conta: " + numero + "\n"
				+ "Nome do cliente: " + cliente + "\n"
				+ "Saldo: " + saldo + "\n");
	}
	
}
