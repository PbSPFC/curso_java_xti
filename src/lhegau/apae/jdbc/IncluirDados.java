package lhegau.apae.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class IncluirDados {
	
	static String nome = "", sexo = "", email = "";
	static int cod = 0;
	
	public static void incluir(){
		boolean v = true;
		nome = JOptionPane.showInputDialog("Digite o nome: ");
		do{
			sexo = JOptionPane.showInputDialog("Digite o sexo [M/F]: ");
			if((sexo.equals("M") || sexo.equals("F"))){v = false;}
			else{JOptionPane.showMessageDialog(null, "Digito inválido!");}
		}while(v);
		email = JOptionPane.showInputDialog("Digite o E-Mail: ");
	}
	
	public static void mostrar(String url, String sql) throws SQLException{
		
		sql = "SELECT CODIGO, NOME, SEXO, EMAIL FROM PESSOA";
		
		try(
				Connection con = DriverManager.getConnection(url, "pbenis", "apae");
				PreparedStatement stm = con.prepareStatement(sql);
				ResultSet rs = stm.executeQuery()
			){
			while(rs.next()){
				JOptionPane.showMessageDialog(null, "Código: " + rs.getString("CODIGO") + "\n"
								+ "Nome: " + rs.getString("NOME") + "\n"
								+ "Sexo: " + rs.getString("SEXO") + "\n"
								+ "E-Mail: " + rs.getString("EMAIL") + "\n"
								+ "\n--------------------------------------------------\n");
					}
				}
	}

	public static int getCod(String url) throws SQLException{
		String x = "SELECT CODIGO FROM PESSOA";
		int y = 0;
		try(
				Connection con = DriverManager.getConnection(url, "pbenis", "apae");
				PreparedStatement stm = con.prepareStatement(x);
				ResultSet rs = stm.executeQuery()
			){while(rs.next()){
				y = rs.getInt("CODIGO");
				}
				}
		return y;
	}
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "insert into pessoa values(?,?,?,?)";
		
		
		cod = getCod(url);
		boolean vv = true;
		
		String continua = JOptionPane.showInputDialog("Deseja incluir? [S] para Incluir: ");
		if(!(continua.equals("S"))){vv = false;}
		
		try (
				Connection con = DriverManager.getConnection(url, "pbenis", "apae");
				PreparedStatement stm = con.prepareStatement(sql);
		) {
			while(vv){
				incluir();
				stm.setInt(1, cod+1);
				stm.setString(2, nome);
				stm.setString(3, sexo);
				stm.setString(4, email);
				stm.addBatch();
				String continua1 = JOptionPane.showInputDialog("Deseja continuar? [S] para continuar: ");
				if(!(continua1.equals("S"))){vv = false;}
				else{cod++;}
			}
			stm.executeBatch();
			mostrar(url, sql);
		}
		
		
		
		
	}

}
