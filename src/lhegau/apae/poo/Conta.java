package lhegau.apae.poo;

public class Conta implements java.io.Serializable {

	public String cliente;
	public double saldo;

	public Conta() {
	}

	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public String getCliente(){
		return cliente;
	}
	public double getSaldo(){
		return saldo;
	}
	
	public void exibeSaldo() {
		System.out.println(cliente + " seu saldo � de " + saldo + "R$");
		System.out.println("--------------------------------------------------");
	}

	void saca(double valor) {
		saldo -= valor;
		System.out.println(cliente + " voc� sacou " + valor + "R$, seu saldo atual � de " + saldo + "R$");
		System.out.println("--------------------------------------------------");
	}

	public void deposita(double valor) {
		saldo += valor;
		System.out.println(cliente + " voc� depositou " + valor + "R$, seu saldo atual � de " + saldo + "R$");
		System.out.println("--------------------------------------------------");
	}

	void transferePara(Conta conta2, double valor) {
		this.saca(valor);
		conta2.deposita(valor);

	}

}
