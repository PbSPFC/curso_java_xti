package lhegau.apae.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {

	List<PrintWriter> escritores = new ArrayList<>();
	
	
	//Metodo Construtor
	public ChatServer(){
		ServerSocket server;
		Scanner leitor;
		
		try{
			server = new ServerSocket(5003);
			while(true){
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
				
			}
		}catch(IOException e){}
	}
	
	private void encaminharMsg(String x1){
		for (PrintWriter pw1 : escritores) {
			try{
				pw1.println(x1);
				pw1.flush();
			}catch(Exception e){}
		}
	}
	
	private class EscutaCliente implements Runnable{
		
		Scanner leitor;
		
		public EscutaCliente(Socket socket){
			try{
			leitor = new Scanner(socket.getInputStream());
			}catch(Exception erro1){}
		}
		
		@Override
		public void run() {
			try{
				String texto;
				while((texto = leitor.nextLine()) != null){
					System.out.println(texto);
					encaminharMsg(texto);
				}
			}catch(Exception erro){}
		}
		
	}
	
	public static void main(String[] args){
		
		new ChatServer();
		

	}

}
