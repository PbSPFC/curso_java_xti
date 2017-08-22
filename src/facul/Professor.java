package facul;

import javax.swing.JOptionPane;

public class Professor extends Pessoa{

	public Professor(){}
	
	public Professor (String nome, String endereco, String rp, String disc, double sal){
		super(nome, endereco);
		this.rp = rp;
		this.disciplina = disc;
		this.salario = sal;
	}
	
	private String rp, disciplina;
	private double salario;
	
	
	//get&set RP
	public String getRP(){
		return rp;
	}
	public void setRP(String x){
		this.rp = x;
	}
	//get&set Disciplina
	public String getDisc(){
		return disciplina;
	}
	public void setDisc(String y){
		this.disciplina = y;
	}
	//get&set Salario
	public double getSalario(){
		return salario;
	}
	public void setSalario(double sal){
		this.salario = sal;
	}
	
	public void mostrarProfessor(){
		super.mostrarPessoa();
		JOptionPane.showMessageDialog(null, "-----Dados do Professor-----\n"
											+ "Registro do Professor: " + rp + "\n"
											+ "Disciplina: " + disciplina + "\n"
											+ "Salário: " + salario + "\n");
	}
	
	
}
