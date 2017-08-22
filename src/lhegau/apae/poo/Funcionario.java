package lhegau.apae.poo;

public class Funcionario {
	
	private String nome, senha;
	private double salario;
	private boolean ativo;
	
	//Getter & Setters
	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		this.nome = n;
	}
	//1
	public String getSenha(){
		return senha;
	}
	public void setSenha(String s){
		this.senha = s;
	}
	//2
	public double getSalario(){
		return salario;
	}
	public void setSalario(double s){
		this.salario = s;
	}
	//3
	public boolean isAtivo(){
		return ativo;
	}
	public void setAtivo(boolean a){
		this.ativo = a;
	}
	//4-----
	
	
	
	
}
