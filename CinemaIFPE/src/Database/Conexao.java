package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Conexao {
	private Connection conexao = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset = null;
	
	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/cineif";
		String usuario = "root";
		String senha = "Fam1l1a..";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			this.conexao = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.conexao.createStatement();
		}catch(Exception e) {
			System.out.println("erro : " + e.getMessage());
		}
	}
	
	public boolean estaConectado() {
		if(this.conexao != null) {
			return true;
		} else{
			return false;
		}
	}
	
	public void listarLanches() {
		try {
			String query = "select * from lanche";
			this.resultset = this.statement.executeQuery(query);
			while(resultset.next()){
				System.out.println(resultset.getString("idLanche"));
				System.out.println(resultset.getString("nome"));
				System.out.println(resultset.getString("marca"));
				System.out.println(resultset.getString("preco"));
				System.out.println(resultset.getString("quantidadeEstoque"));
			}

			
			
		}catch(Exception e) {
			System.out.println("erro: " + e.getMessage());
		} 
	}
	
}