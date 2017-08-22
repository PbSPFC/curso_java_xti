package facul;

import javax.swing.JOptionPane;

public class Pessoa {
	
	public Pessoa(){}
	public Pessoa(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
	
	private String nome, endereco;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEnd(){
		return endereco;
	}
	public void setEnd(String ende){
		this.endereco = ende;
	}
	
	public void mostrarPessoa(){
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + 
											"Endereço: " + endereco + "\n");
	}
	
}
