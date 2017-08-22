package facul;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{

	public Aluno(){}
	public Aluno(String nome, String endereco, String ra, double nota){
		super(nome, endereco);
		this.ra = ra;
		this.nota = nota;
	}
	
	private String ra;
	private double nota;
	
	//get set ra
	public String getRA(){
		return ra;
	}
	public void setRA(String x){
		this.ra = x;
	}
	//get set nota
	public double getNota(){
		return nota;
	}
	public void setNota(double y){
		this.nota = y;
	}
	
	public void mostrarAluno(){
		super.mostrarPessoa();
		JOptionPane.showMessageDialog(null, "-----Dados do Aluno-----\n"
				+ "Registro do Aluno: " + ra + "\n"
				+ "Nota final: " + nota + "\n");
	}
	
	
}
