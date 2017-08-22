package facul;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PessoaTeste {

	
	
	public void incluirProfessor(Professor professor){
		String nome = JOptionPane.showInputDialog("Digite o nome do professor: ");
		String endereco = JOptionPane.showInputDialog("Digite o endereço do professor: ");
		String rp = JOptionPane.showInputDialog("Digite o número de registro do professor: ");
		String disc = JOptionPane.showInputDialog("Digite a disciplina do professor: ");
		double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do professor: "));
		
		professor.setNome(nome);
		professor.setEnd(endereco);
		professor.setRP(rp);
		professor.setDisc(disc);
		professor.setSalario(sal);
	}
	
	public void incluirAluno(Aluno aluno){
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		String endereco = JOptionPane.showInputDialog("Digite o endereço do aluno: ");
		String ra = JOptionPane.showInputDialog("Digite o número de registro do aluno: ");
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota final do aluno: "));
		
		aluno.setNome(nome);
		aluno.setEnd(endereco);
		aluno.setRA(ra);
		aluno.setNota(nota);
	}
	
	public static void main(String[] args) {
		PessoaTeste pt = new PessoaTeste();
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		Scanner input = new Scanner(System.in);
		int replay = 0;
		boolean erro = true;
		
		
		do{
			try{
			
				pt.incluirProfessor(professor);
				pt.incluirAluno(aluno);
				
				professor.mostrarProfessor();
				aluno.mostrarAluno();
				
			erro = false;
			}catch(Exception erro1){
				System.err.println("Ocorreu um erro!");
				input.nextLine();
			}finally{
				replay++;
				System.out.println("Número de execuções: " + replay);
			}
		}while(erro);
	}

}
