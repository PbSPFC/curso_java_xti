package lhegau.apae.threads;

public class ContaConjunta {
	
	private double saldo = 5000;
	
	public double getSaldo(){
		return saldo;
	}
	
	public synchronized void sacar(double x, String y){
		if(saldo >= x){
			double saldoAnterior = saldo;
			System.out.println("Processando seu saque " + y + ", por favor aguarde...");
			try{Thread.sleep(2000);}catch(InterruptedException e){}
			saldo -= x;
			System.out.println(y + ", seu saque de " + x + " foi realizado com sucesso!\n"
					+ "SALDO ANTERIOR: " + saldoAnterior + "\n"
							+ "SALDO ATUAL: " + saldo);
		}else{
			System.out.println("Saldo insuficiente para realizar esta transação!");
		}
		System.out.println("\n--------------------------------------------------\n");
	}
	
}
