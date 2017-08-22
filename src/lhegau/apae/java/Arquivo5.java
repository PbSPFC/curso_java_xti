package lhegau.apae.java;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public void diretorioRaiz(){
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path path : dirs) {
			System.out.println(path);
		}
	}
	
	public void listarConteudo() throws IOException{
		Path dir = Paths.get("C:/lhegau/");
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		}catch(IOException|DirectoryIteratorException e){
			e.printStackTrace();
		}
	}
	
	public void particoes() throws IOException{
		FileSystem fs = FileSystems.getDefault();
		for (FileStore store : fs.getFileStores()) {
			System.out.println("Unidade: " + store.toString());
			System.out.println("Total de espaço: " + (store.getTotalSpace() / 1000000000) + "Gb");
			System.out.println("Total disponível: " + (store.getUsableSpace() / 1000000000) + "Gb");
			System.out.println("Total usado: " + ((store.getTotalSpace() - store.getUsableSpace()) / 1000000000) + "Gb");
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Arquivo5 arq = new Arquivo5();
		
		arq.diretorioRaiz();
		arq.listarConteudo();
		arq.particoes();
	}

}
