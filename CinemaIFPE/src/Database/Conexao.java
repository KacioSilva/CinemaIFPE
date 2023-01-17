package Database;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public ArrayList getArrayPull() {
		return this.arrayPull;
	}
	
	
	public void conectar() throws SQLException, ClassNotFoundException {
		String servidor = "jdbc:mysql://localhost:3306/cineif";
		String usuario = "root";
		String senha = "203040lL";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(servidor, usuario, senha);
		}catch(SQLException e) {
			throw new SQLException("Erro de acesso ao banco!");			
		}catch(ClassNotFoundException e1){
			throw new ClassNotFoundException("Erro inesperado!");
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

			
		}catch(SQLException e) {
			System.out.println("erro: " + e.getMessage());
		}	
	}	
	
	
	public void editarGeral(int idLanche,String nome, String marca, int preco, int quantidadeEstoque) throws SQLException{
        String editarGeralUp = "update lanche set nome=?, marca=?, preco=?, quantidadeEstoque=? where idlanche = ?";
        try {

            PreparedStatement pstmt = conexao.prepareStatement(editarGeralUp);
            pstmt.setString(1, nome);
            pstmt.setString(2, marca);
            pstmt.setInt(3, preco);
            pstmt.setInt(4, quantidadeEstoque);
            pstmt.setInt(5, idLanche);

            pstmt.executeUpdate();

            PreparedStatement statement = conexao.prepareStatement("select * from lanche");

            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("idLanche"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("marca"));
                System.out.println(rs.getString("preco"));
                System.out.println(rs.getString("quantidadeEstoque"));
            }
        }
        catch(SQLException e){
            throw new SQLException("Erro ao conectar com o banco!");
        }
        finally {
            conexao.close();
        }
    }
}