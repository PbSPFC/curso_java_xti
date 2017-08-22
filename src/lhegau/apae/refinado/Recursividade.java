package lhegau.apae.refinado;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {

	public static int soma(int x){
		if(x == 0){
			System.out.print(x + ".\n");
			return x;
		}else{
			System.out.print(x + ", ");
			return x + soma(x-1);
		}
	}
	
	public static int potencia(int x, int e){
		if(e == 1){
			System.out.print(x + ".\n");
			return x;
		}else{
			System.out.print(x + " * ");
			return x * potencia(x, e - 1);
		}
	}
	
	public static void listar(Path path){
		
		if(Files.isRegularFile(path)){
			System.out.println(path.toAbsolutePath());
		}else{
			System.out.println(path.toAbsolutePath());
			try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
				System.out.println("\n--------------------------------------------------"
						+ "--------------------------------------------------");
				String s = "\n" + path.toAbsolutePath();
				System.err.println(s.toUpperCase());
				for (Path p : stream) {
					listar(p);
				}
				
			}catch(Exception e){}
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int x = input.nextInt();
		
		System.out.println("A soma dos números é: " + soma(x));
		
		System.out.print("Digite um número para a potêncializar o primeiro número: ");
		int e = input.nextInt();
		
		System.out.println(potencia(x, e));
		*/
		
		listar(Paths.get("C:/lhegau/"));
		
		
	}

}
