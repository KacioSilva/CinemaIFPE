package Database;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Core.Administrador;

public class Conexao {
	
	//ATRIBUTOS DOS LANCHES
	private String nome;
	private String marca;
	private String preco;
	private String quantidade;
	
	//MÉTODOS DOS LANCHES
	public String getNome() {
		return this.nome;
	}public String getMarca() {
		return this.marca;
	}
	public String getPreco() {
		return this.preco;
	}
	public String getQuantidade() {
		return this.quantidade;
	}
	private ArrayList<String> arrayPull = new ArrayList<String>();
	
	private Connection conexao = null;
	//private java.sql.Statement statement = null;
	//private ResultSet resultset = null;
	

	
	public ArrayList getArrayPull() {
		return this.arrayPull;
	}
	
	
	
	public void conectar() throws Exception {
		String servidor = "jdbc:mysql://localhost:3306/cineif";
		String usuario = "root";
		String senha = "Tt4189952";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(servidor, usuario, senha);
			//this.statement = this.conexao.createStatement();
		}catch(Exception e) {
			throw new Exception("Erro de acesso ao banco!");
			//System.out.println("erro : " + e.getMessage());
		}
	}
	
	public boolean estaConectado() {
		if(this.conexao != null) {
			return true;
		} else{
			return false;
		}
	}
	
	public void lanche1(int idlancheh) {
		try {
			//Conexao conexao = new Conexao();
			String query = "select * from lanche where idLanche = ?";
			PreparedStatement resultset = conexao.prepareStatement(query);
			resultset.setInt(1, idlancheh);
			ResultSet rs = resultset.executeQuery();
			
			while(rs.next()){
				arrayPull.add(rs.getString("idLanche"));
                arrayPull.add(rs.getString("nome"));
                arrayPull.add(rs.getString("marca"));
                arrayPull.add(rs.getString("preco"));
                arrayPull.add(rs.getString("quantidadeEstoque"));
			}
			nome = arrayPull.get(1);
			marca = arrayPull.get(2);
			preco = arrayPull.get(3);
			quantidade = arrayPull.get(4);
			System.out.println(arrayPull);
			arrayPull.clear();

			
		}catch(Exception e) {
			System.out.println("erro: " + e.getMessage());
		}	
		
	}	
}