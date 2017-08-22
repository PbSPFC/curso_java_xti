package facul;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaTelTeste {
	
		

		
	
		
	public void incluir(Scanner input, ArrayList<AgendaTel> contato){
		System.out.println("Nome do contato: ");
		String nome = input.nextLine();
		nome = input.nextLine();
		System.out.println("Número do contado: ");
		String numero = input.next();
		
		contato.add(new AgendaTel(nome, numero));
	}
		
	public void procurar(Scanner input, ArrayList<AgendaTel> contato){
		System.out.println("Pesquisar [Digite o nome do contato]: ");
		String nome = input.nextLine();
		nome = input.nextLine();
		boolean v = false;
		for (AgendaTel x : contato) {
			if(nome.equals(x.getNome())){
				System.out.println("Resultado da pesquisa\n"
						+ "Nome: " + x.getNome() + "\nNúmero do telefone: " + x.getNumero() + "\n");
				v = true;
			}
		}
		
		if(v == false){System.out.println("Nenhum resultado encontrado!\n");}
	}
	
	public void apagar(Scanner input, ArrayList<AgendaTel> contato){
		System.out.println("Apagar [Digite o nome do contato]: ");
		String n = input.nextLine();
		n = input.nextLine();
		boolean v = false;
		for (AgendaTel x : contato) {
			if(n.equals(x.getNome())){
				contato.remove(contato);
				x.setNome("");
				x.setNumero("");
				System.out.println("Contato apagado com sucesso!");
				v = true;
			}
		}
		if(v == false){System.out.println("Nenhum contato com esse nome foi encontrado!\n");}
	}
	
	
	
	public void mostrar(ArrayList<AgendaTel> contato){
		for (AgendaTel x : contato) {
			if("".equals(x.getNome()) && "".equals(x.getNumero())){
				continue;
			}
			else{System.out.println("Nome: " + x.getNome() + "\nNúmero do telefone: " + x.getNumero());
			System.out.println("--------------------------------------------------\n");
			}
		}
		
	}

	public static void main(String[] args) {
		
		AgendaTel a = new AgendaTel();
		Scanner input = new Scanner(System.in);
		ArrayList<AgendaTel> contato = new ArrayList<>();
		
		AgendaTelTeste at = new AgendaTelTeste();
		
		boolean v = false;
		int n = 1;
		do{		
		System.out.print("1 - Incluir - \n"
				+ "2 - Procurar - \n"
				+ "3 - Apagar - \n"
				+ "4 - Mostrar todos os contatos - \n"
				+ "5 - Sair -\n"
				+ "Digite sua escolha: ");
		n = input.nextInt();
		System.out.println("--------------------------------------------------");
		if(n == 1){
			at.incluir(input, contato);
		}else if (n == 2){
			at.procurar(input, contato);
		}else if (n == 3){
			at.apagar(input, contato);
		}else if (n == 4){
			at.mostrar(contato);
		}else if (n == 5){
			
			v = true;
		}else{
			System.out.println("Você digitou um número inválido!");
			System.out.println("--------------------------------------------------");
		}
		} while (v == false);
		
	}

}
