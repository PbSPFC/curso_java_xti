package lhegau.apae.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		//Java 7
		Path path = Paths.get("C:/lhegau/files/texto.txt");
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		//Criação de diretório
		
		
		Files.createDirectories(path.getParent());
		
		//Escrever e ler dados
		
		byte[] bytes = "Lagartao voltou".getBytes();
		Files.write(path, bytes);//cria, limpa, escreve o texto
		
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
		
	}

}
