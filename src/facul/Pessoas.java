package facul;
import java.util.Scanner;

public class Pessoas {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		GetSet gs = new GetSet();
		
		System.out.println("Digite seu nome: ");
		gs.setNome(input.nextLine());
		
                System.out.println("Digite o nome do seu pai: ");
                gs.setPai(input.nextLine());
                
                System.out.println("Digite o nome da sua mãe: ");
                gs.setMae(input.nextLine());
                
                System.out.println("Estado cívil [Digite C para Casado/S para Solteiro]: ");
                String casado1 = input.next();
                gs.setCasado("C".equals(casado1) ? true : false); 
                
                
		String n = gs.getNome();
                String p = gs.getPai();
                String m = gs.getMae();
                boolean c = gs.isCasado();
                
		System.out.println("Nome: " + n + ".");
                System.out.println("Nome do pai: " + p + ".");
                System.out.println("Nome da mãe: " + m + ".");
                if (c == true){System.out.println("Estado cívil: Casado.");}
                else {System.out.println("Estado cívil: Solteiro.");}
                
    }
    
}
