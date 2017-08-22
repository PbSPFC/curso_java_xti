package lhegau.apae.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	Path path = Paths.get("C:/lhegau/files/fonte.txt");
	Path copia = Paths.get("C:/lhegau/files/fonte_copia.txt");
	Path mover = Paths.get("C:/lhegau/files/move/fonte_movel.txt");
	
	
	public void listarDetalhes() throws IOException{
		System.out.println("Exists: " + Files.exists(path));
		System.out.println("Diractory: " + Files.isDirectory(path));	
		System.out.println("RegularFile: " + Files.isRegularFile(path));
		System.out.println("Readable: " + Files.isReadable(path));
		System.out.println("Executable: " + Files.isExecutable(path));
		System.out.println("Size: " + Files.size(path));
		System.out.println("Last Time: " + Files.getLastModifiedTime(path));
		System.out.println("Owner: " + Files.getOwner(path));
		System.out.println("Probe: " + Files.probeContentType(path));
	}
	
	public void deletarArquivo(Path x) throws IOException{
		
		//Files.delete(x);
		boolean v = Files.deleteIfExists(x);
		if (v == true){System.out.println("Deletado com sucesso!\n");}
		else{System.out.println("Não foi possivel deletar o arquivo!");}
	}
	
	public void criarArquivo() throws IOException{
		Files.createFile(path);
		Files.write(path, "OOOW O Lagartão Voltou!".getBytes());
		
	}
	
	public void copiarArquivo() throws IOException{
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
	}
	
	public void moverArquivo() throws IOException{
		Files.createDirectories(mover.getParent());
		Files.move(path, mover);
	}
	
	public static void main(String[] args) throws IOException {
		Arquivo4 arq = new Arquivo4();
		
		arq.deletarArquivo(arq.path);
		arq.deletarArquivo(arq.mover);
		arq.criarArquivo();
		arq.copiarArquivo();
		arq.listarDetalhes();
		arq.moverArquivo();
				
	}

}
