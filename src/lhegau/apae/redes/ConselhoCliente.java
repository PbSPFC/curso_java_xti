package lhegau.apae.redes;

import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws Exception{
		
		//0 - 1023 email, ftp, etc
		Socket socket = new Socket("127.0.0.1", 5000);
		Scanner inputS = new Scanner(socket.getInputStream());
		System.out.println("Lagarto: " + inputS.nextLine());
		inputS.close();
		

	}

}
