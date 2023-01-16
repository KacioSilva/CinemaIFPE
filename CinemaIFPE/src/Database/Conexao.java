package Database;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
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
	private java.sql.Statement statement = null;
	private ResultSet resultset = null;
	

	
	public ArrayList getArrayPull() {
		return this.arrayPull;
	}
	
	
	
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
	
	public void lanche1() {
		try {
			Conexao conexao = new Conexao();
			String query = "select * from lanche where idLanche = 1";
			this.resultset = this.statement.executeQuery(query);
			while(resultset.next()){
				arrayPull.add(resultset.getString("idLanche"));
                arrayPull.add(resultset.getString("nome"));
                arrayPull.add(resultset.getString("marca"));
                arrayPull.add(resultset.getString("preco"));
                arrayPull.add(resultset.getString("quantidadeEstoque"));
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
	public void lanche2() {
		try {
			Conexao conexao = new Conexao();
			String query = "select * from lanche where idLanche = 2";
			this.resultset = this.statement.executeQuery(query);
			while(resultset.next()){
				arrayPull.add(resultset.getString("idLanche"));
                arrayPull.add(resultset.getString("nome"));
                arrayPull.add(resultset.getString("marca"));
                arrayPull.add(resultset.getString("preco"));
                arrayPull.add(resultset.getString("quantidadeEstoque"));
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
	public void lanche3() {
		try {
			Conexao conexao = new Conexao();
			String query = "select * from lanche where idLanche = 3";
			this.resultset = this.statement.executeQuery(query);
			while(resultset.next()){
				arrayPull.add(resultset.getString("idLanche"));
                arrayPull.add(resultset.getString("nome"));
                arrayPull.add(resultset.getString("marca"));
                arrayPull.add(resultset.getString("preco"));
                arrayPull.add(resultset.getString("quantidadeEstoque"));
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
	public void lanche4() {
		try {
			Conexao conexao = new Conexao();
			String query = "select * from lanche where idLanche = 4";
			this.resultset = this.statement.executeQuery(query);
			while(resultset.next()){
				arrayPull.add(resultset.getString("idLanche"));
                arrayPull.add(resultset.getString("nome"));
                arrayPull.add(resultset.getString("marca"));
                arrayPull.add(resultset.getString("preco"));
                arrayPull.add(resultset.getString("quantidadeEstoque"));
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
	public void lanche5() {
		try {
			Conexao conexao = new Conexao();
			String query = "select * from lanche where idLanche = 5";
			this.resultset = this.statement.executeQuery(query);
			while(resultset.next()){
				arrayPull.add(resultset.getString("idLanche"));
                arrayPull.add(resultset.getString("nome"));
                arrayPull.add(resultset.getString("marca"));
                arrayPull.add(resultset.getString("preco"));
                arrayPull.add(resultset.getString("quantidadeEstoque"));
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