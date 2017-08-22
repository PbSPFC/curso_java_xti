package lhegau.apae.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import lhegau.apae.poo.Conta;

public class Arquivo3 {
	
	private Path path = Paths.get("C:/lhegau/files/contas.txt");
	private Charset texto = StandardCharsets.UTF_8;

	/*public void criaConta(ArrayList<Conta> contas) {

		try (BufferedWriter write = Files.newBufferedWriter(path, texto)) {

			for (Conta conta : contas) {
				write.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
				write.flush();
			}

		} catch (IOException erro1) {
			erro1.printStackTrace();
		} finally {
			System.out.println("Finalizado com sucesso!");
		}
	}*/

	public ArrayList<Conta> recuperarContas() throws IOException {

		ArrayList<Conta> contas = new ArrayList<>();
		
		try (BufferedReader reader = Files.newBufferedReader(path, texto)) {
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] t = line.split(";");
				Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
		return contas;
	}

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Arquivo3 operacao = new Arquivo3();
		String sim = "S", cliente;
		double saldo;
		boolean cont = false;

		/*do {
			System.out.println("Digite o nome do cliente: ");
			cliente = input.nextLine();
			System.out.println("Digite o saldo do cliente: ");
			saldo = input.nextDouble();
			contas.add(new Conta(cliente, saldo));

			System.out.println("Deseja criar outra conta? Digite [S] para criar uma nova conta: ");
			sim = input.nextLine();
			sim = input.nextLine();
			if (!(sim.equals("S"))) {
				cont = true;
			}
		} while (cont == false);

		operacao.criaConta(contas);
		*/
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();
		}
	}

}
