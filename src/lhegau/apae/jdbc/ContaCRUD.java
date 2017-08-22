package lhegau.apae.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ContaCRUD {

	public void criar(Connection con, Conta conta) throws SQLException{
		String sql = "insert into conta values(?,?,?)";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1, conta.numero);
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
		}
	}
	
	public void alterar(Connection con, Conta conta) throws SQLException{
		String sql = "update conta set cliente=?, saldo=? where numero=?";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1, conta.cliente = JOptionPane.showInputDialog("Digite o nome do cliente:"));
			stm.setDouble(2, conta.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo do cliente:")));
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}
	}
	
	public void alterarComum(Connection con, Conta conta) throws SQLException{
		String sql = "update conta set cliente=?, saldo=? where numero=?";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1, conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}
	}
	
	public void deletar(Connection con, Conta conta) throws SQLException{
		String sql = "delete from conta where numero=?";
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1, conta.numero);
			stm.executeUpdate();
		}
	}
	
	public List<Conta> ler(Connection con) throws SQLException{
		List<Conta> lista = new ArrayList<>();
		String sql = "select numero, cliente, saldo from conta";
		try(PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		}
		return lista;
	}
	
	public int getNumeroConta(Connection con) throws SQLException{
		String sql = "select numero from conta";
		int x = 0;
		try(PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				x = rs.getInt("numero");
			}
		}		
		return x;
	}
	
	public String getNumeroTexto(Connection con) throws SQLException{
		String sql = "select numero, cliente, saldo from conta";
		String x = "";
		try(PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				x = x + rs.getString("cliente") + ": " + rs.getInt("numero") + ", Saldo: " + rs.getDouble("saldo") + "\n";
			}
		}		
		return x;
	}
	
	public void criarConta(List<Conta> conta, Connection con) throws SQLException{
		boolean v = true;
		int cod = getNumeroConta(con);
		String cliente, cc;
		double saldo;
		do{
			cliente = JOptionPane.showInputDialog("Digite o nome do cliente: ");
			saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inícial do cliente: "));
			conta.add(new Conta(cod + 1, cliente, saldo));
			
			cc = JOptionPane.showInputDialog(null, "Deseja continuar? Digite [S] para continuar: ");
			
			if(!(cc.equals("S"))){
				v = false;
			}else{
				cod++;
			}
			
		}while(v);
		
		for (Conta x : conta) {
			criar(con, x);
		}
	}
	
	public void alterarConta(List<Conta> conta, Connection con) throws SQLException{
		if("S".equals(JOptionPane.showInputDialog("Deseja alterar alguma conta? [S] para alterar conta:"))){
			boolean v = true;
			System.out.println(getNumeroTexto(con));
			do{
			int nx = (Integer.parseInt(JOptionPane.showInputDialog("Digite número da conta a ser alterada:")) - 1);
			alterar(con, conta.get(nx));
			JOptionPane.showMessageDialog(null, conta.get(nx));
			if(!("S".equals(JOptionPane.showInputDialog("Deseja alterar outra conta? [S] para alterar outra conta:")))){
				v = false;
			}
			}while(v);
		}
	}
	
	public void deletarConta(List<Conta> conta, Connection con) throws SQLException{
		if("S".equals(JOptionPane.showInputDialog("Deseja deletar alguma conta? [S] para deletar conta:"))){
			boolean v = true;
			System.out.println(getNumeroTexto(con));
			do{
			int nx = (Integer.parseInt(JOptionPane.showInputDialog("Digite número da conta a ser deletada:")) - 1);
			deletar(con, conta.get(nx));
			System.out.println(getNumeroTexto(con));
			if(!("S".equals(JOptionPane.showInputDialog("Deseja deletar outra conta? [S] para alterar outra conta:")))){
				v = false;
			}
			}while(v);
		}
	}

	public void transferir(Connection con, Conta origem, Conta destino, double valor) throws SQLException{
		if(origem.saldo >= valor){
				try{
					con.setAutoCommit(false);
					//Saque
					origem.saldo -= valor;
					alterarComum(con, origem);
					//Deposito
					destino.saldo += valor;
					alterarComum(con, destino);
					
					con.commit();
				}catch(Exception e){
				con.rollback();
			}
		}else{
			JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar esta transação!");
		}
	}
	
	public void transferirSaldo(Connection con, List<Conta> conta) throws SQLException{
		if("S".equals(JOptionPane.showInputDialog("Deseja realizar uma transferência bancária? [S] para realizar transferência:"))){
			boolean v = true;
			System.out.println(getNumeroTexto(con));
			do{
				int origem = (Integer.parseInt(JOptionPane.showInputDialog("Digite número da conta de origem:")) - 1);
				int destino = (Integer.parseInt(JOptionPane.showInputDialog("Digite número da conta de destino:")) - 1);
				
				transferir(con, conta.get(origem), conta.get(destino), Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transferência: ")));
				
				JOptionPane.showMessageDialog(null, "Conta de Origem: \n" + conta.get(origem));
				JOptionPane.showMessageDialog(null, "Conta de Origem: \n" + conta.get(destino));
				
				if(!("S".equals(JOptionPane.showInputDialog("Deseja alterar outra tranferência? [S] para realizar outra tranferência:")))){
					v = false;
				}
			}while(v);
		}
	}
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try(Connection con = DriverManager.getConnection(url, "pbenis", "apae")){
			ContaCRUD crud = new ContaCRUD();
			List<Conta> criarConta = new ArrayList<>();
			
			if("S".equals(JOptionPane.showInputDialog("Deseja criar alguma conta? [S] para criar conta:"))){
				crud.criarConta(criarConta, con);
			}
			
			List<Conta> conta = crud.ler(con);
			for (Conta x : conta) {
				JOptionPane.showMessageDialog(null, x);
			}
			
			crud.alterarConta(conta, con);
			crud.deletarConta(conta, con);
			crud.transferirSaldo(con, conta);

		}
		
	}
}
