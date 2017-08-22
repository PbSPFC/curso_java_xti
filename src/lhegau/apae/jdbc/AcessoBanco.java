package lhegau.apae.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcessoBanco {

	public static void main(String[] args) throws Exception {
		
		String sql = "SELECT CODIGO, NOME, SEXO, EMAIL FROM PESSOA";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try(Connection con = DriverManager.getConnection(url, "pbenis", "apae");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				System.err.println("Código: " + rs.getString("CODIGO") + "\n"
						+ "Nome: " + rs.getString("NOME") + "\n"
						+ "Sexo: " + rs.getString("SEXO") + "\n"
						+ "E-Mail: " + rs.getString("EMAIL") + "\n"
						+ "\n--------------------------------------------------\n");
			}
		}
		
		
		
	}

}
