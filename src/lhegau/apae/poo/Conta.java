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
		System.out.println(cliente + " seu saldo é de " + saldo + "R$");
		System.out.println("--------------------------------------------------");
	}

	void saca(double valor) {
		saldo -= valor;
		System.out.println(cliente + " você sacou " + valor + "R$, seu saldo atual é de " + saldo + "R$");
		System.out.println("--------------------------------------------------");
	}

	public void deposita(double valor) {
		saldo += valor;
		System.out.println(cliente + " você depositou " + valor + "R$, seu saldo atual é de " + saldo + "R$");
		System.out.println("--------------------------------------------------");
	}

	void transferePara(Conta conta2, double valor) {
		this.saca(valor);
		conta2.deposita(valor);

	}

}
