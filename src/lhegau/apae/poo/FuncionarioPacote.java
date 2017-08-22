package lhegau.apae.poo;

import java.util.Scanner;

public class FuncionarioPacote {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = "";
		double s;
		//funcionário 1
		//Preenchimento do formulário
		Funcionario func = new Funcionario();
		System.out.println("Digite o nome do funcionário: ");
		func.setNome(input.nextLine());
		System.out.print("Digite o sálario de " + func.getNome() + ": ");
		func.setSalario(input.nextDouble());
		System.out.print(func.getNome() + " está ativo? \"Digite [A] para ativo e qualquer digito para inátivo\": ");
		a = input.next();
		func.setAtivo("A".equals(a));
		System.out.println("----------------------------------------");
		//Status do funcionário
		System.out.println("Nome do funcionário: " + func.getNome() + ";");
		System.out.println("Salário de " + func.getNome() + ": " + func.getSalario());
		a = (func.isAtivo() ? "Ativo" : "Inátivo");
		System.out.println(func.getNome() + " está " + a);
		
		
		
		
		
	}

}
