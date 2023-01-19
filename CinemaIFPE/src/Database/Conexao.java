package Database;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import Core.Administrador;
import Core.Filme;
import Core.Lanche;

public class Conexao {
	
	private Connection conexao = null;
	
	public void conectar() throws SQLException, ClassNotFoundException {
		String servidor = "jdbc:mysql://localhost:3306/cineif";
		String usuario = "root";
		String senha = "Fam1l1a..";
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
	
	
	
	public void editarFilme(int idFilme, String nome, String cartaz, String trailer, String sinopse, String diretor, int duracao, String genero, 
			String anoLancamento, int classificacaoIndicativa ) throws SQLException{
			try {
				conectar();
				String inserirFilmes = "UPDATE filme SET nome = ?, cartaz = ?, trailer = ?, sinopse = ?, diretor = ?, duracao = ?, genero = ?, anoLancamento = ?, classificacaoIndicativa = ? WHERE idFilme = ?";
				PreparedStatement pstmt = conexao.prepareStatement(inserirFilmes);
				pstmt.setString(1, nome);
				pstmt.setString(2, cartaz);
				pstmt.setString(3, trailer);
				pstmt.setString(4, sinopse);
				pstmt.setString(5, diretor);
				pstmt.setInt(6, duracao);
				pstmt.setString(7, genero);
				pstmt.setString(8, anoLancamento);
				pstmt.setInt(9, classificacaoIndicativa);
				pstmt.setInt(10, idFilme);
				pstmt.execute();

				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
}
//String nome, String cartaz, String trailer, String sinopse, String diretor, String duracao, String genero, 
//String anoLancamento, String classificacaoIndicativa