package lhegau.apae.poo;

import java.util.Scanner;

public class FuncionarioPacote {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = "";
		double s;
		//funcion�rio 1
		//Preenchimento do formul�rio
		Funcionario func = new Funcionario();
		System.out.println("Digite o nome do funcion�rio: ");
		func.setNome(input.nextLine());
		System.out.print("Digite o s�lario de " + func.getNome() + ": ");
		func.setSalario(input.nextDouble());
		System.out.print(func.getNome() + " est� ativo? \"Digite [A] para ativo e qualquer digito para in�tivo\": ");
		a = input.next();
		func.setAtivo("A".equals(a));
		System.out.println("----------------------------------------");
		//Status do funcion�rio
		System.out.println("Nome do funcion�rio: " + func.getNome() + ";");
		System.out.println("Sal�rio de " + func.getNome() + ": " + func.getSalario());
		a = (func.isAtivo() ? "Ativo" : "In�tivo");
		System.out.println(func.getNome() + " est� " + a);
		
		
		
		
		
	}

}
