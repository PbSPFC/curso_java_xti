package facul;

import java.util.ArrayList;

public class AgendaTel {
	
	private String nome, numero;
	
	public AgendaTel(){}
	public AgendaTel(String nome, String numero){
		this.nome = nome;
		this.numero = numero;
	}
	
	
	//-----
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getNumero(){
		return numero;
	}
	

	
	//-----
	
	
}
