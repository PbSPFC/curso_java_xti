package lhegau.apae.poo;

import java.util.Scanner;

public class Carro {
	Scanner input = new Scanner(System.in);
	private String modelo;
	private int velocidademax;
	private double kmzerocem;
	Motor motor;
	
	public Carro() {}

	public Carro(String modelo, int velocidademax, double kmzerocem){
		this(modelo, velocidademax, kmzerocem, null);
	}
	
	public Carro(String modelo, int velo, double km, Motor motor) {
		this.modelo = modelo;
		this.velocidademax = velo;
		this.kmzerocem = km;
		this.motor = motor;
	}

	public void showCarro() {
		System.out.println("Modelo: " + this.modelo + ";");
		System.out.println("Velocidade máxima: " + this.velocidademax + "kmph;");
		System.out.println(this.modelo + " chega a 100kmph em " + this.kmzerocem + " segundos;");
		System.out.println("Motor: " + motor.tipo + ";");
		System.out.println("Potência do motor: " + motor.potencia + ".");
	}

}
