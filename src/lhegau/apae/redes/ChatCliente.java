package lhegau.apae.redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente extends JFrame{
	
	String nome;
	
	Scanner leitor;
	Socket socket;
	PrintWriter escritor;
	
	JTextField txtEnviar;
	JTextArea txtArea;
	JButton btnEnviar;
	
	Font fonte = new Font("Arial", Font.PLAIN, 24);
	
	//Classe para receber dados do servidor
	private class EscutaServidor implements Runnable{

		@Override
		public void run() {
			try{
				String x1;
				while((x1 = leitor.nextLine()) !=null){
					txtArea.append(x1 + "\n");
				}
			}catch(Exception erro2){}
		}
		
		
		
	}
	
	public ChatCliente(String nome) throws UnknownHostException, IOException{
		super("Soccer Talk: " + nome);
		this.nome = nome;
		//Atributos Gui
		txtEnviar = new JTextField();
		btnEnviar = new JButton("Enviar");
		txtArea = new JTextArea();
		//Fontes
		txtEnviar.setFont(fonte);
		btnEnviar.setFont(fonte);
		txtArea.setFont(fonte);
		JScrollPane scroll = new JScrollPane(txtArea);
		//Botoes
		btnEnviar.addActionListener(new BtnEnviar());
		//Container
		Container c1 = new JPanel();
		c1.setLayout(new BorderLayout());
		c1.add(BorderLayout.CENTER, txtEnviar);
		c1.add(BorderLayout.EAST, btnEnviar);
		
		getContentPane().add(BorderLayout.CENTER, scroll);
		getContentPane().add(BorderLayout.SOUTH, c1);
		
		configurarServidor();
		//Propriedades do JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
		
	
		
	}

	//Botoes ActionListener
	public class BtnEnviar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			escritor.println(nome + ": " + txtEnviar.getText());
			escritor.flush();
			txtEnviar.setText("");
			txtEnviar.requestFocus();
			
		}
		
	}
	
	//Metodo para configurar o servidor
	private void configurarServidor(){
		try{
		socket = new Socket("127.0.0.1", 5003);
		escritor = new PrintWriter(socket.getOutputStream());
		leitor = new Scanner(socket.getInputStream());
		new Thread(new EscutaServidor()).start();
		}catch(Exception e){}
		
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException{
		
		Scanner input = new Scanner(System.in);
		String nome = JOptionPane.showInputDialog("Digite seu nome!");
		
		
		new ChatCliente(nome);
		
	}

}
