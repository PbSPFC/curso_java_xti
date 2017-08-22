package lhegau.apae.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		Path path = Paths.get("C:/lhegau/files/texto.txt");
		Charset utf = StandardCharsets.UTF_8;

		BufferedWriter w = null;

		try {
			w = Files.newBufferedWriter(path, utf);
			System.out.println("Digite a primeira linha do arquivo de texto: ");
			w.write(input.nextLine() + "\n");
			System.out.println("Digite a segunda linha do arquivo de texto: ");
			w.write(input.nextLine() + "\n");
			w.flush();
		} catch (IOException erro1) {
			erro1.printStackTrace();
		} finally {
			if (w != null) {
				w.close();
				System.out.println("Arquivo salvo com sucesso!");
			}
		}

		/*try (BufferedWriter s = Files.newBufferedWriter(path, utf)) {
			System.out.println("Digite a primeira linha do arquivo de texto: ");
			s.write(input.nextLine() + "\n");
			System.out.println("Digite a segunda linha do arquivo de texto: ");
			s.flush();
		} catch (IOException erro1) {
			erro1.printStackTrace();
		}
		*/
		
		try(BufferedReader r = Files.newBufferedReader(path, utf)){
			String line = null;
			while((line = r.readLine()) != null){
				System.out.println(line);
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
