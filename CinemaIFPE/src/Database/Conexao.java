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
	
	public Connection conectar() throws SQLException, ClassNotFoundException {
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
		} return conexao;
	}
	
	public Connection getConexao() {
		return conexao;
	}

	public boolean estaConectado() {
		if(this.conexao != null) {
			return true;
		
		}return false;
	}
	
	public void editarGeral(int idLanche ,String nome, String marca, int preco, String caminhoFoto) throws SQLException, ClassNotFoundException{
        String editarGeralUp = "update lanche set nome=?, marca=?, preco=?, caminhofoto=? where idlanche = ?";
        try {
        	conectar();
            PreparedStatement pstmt = conexao.prepareStatement(editarGeralUp);
            pstmt.setString(1, nome);
            pstmt.setString(2, marca);
            pstmt.setInt(3, preco);
            pstmt.setString(4, caminhoFoto);
            pstmt.setInt(5, idLanche);

            pstmt.executeUpdate();

            PreparedStatement statement = conexao.prepareStatement("select * from lanche");

            ResultSet rs = statement.executeQuery();
        
        }finally {
        	if(conexao != null) {
        	conexao.close();
        	}
        }
}
	
	public void editarFilme(int idFilme, String nome, String cartaz, String trailer, String sinopse, String diretor, int duracao, String genero, 
			String anoLancamento, int classificacaoIndicativa ) throws SQLException, ClassNotFoundException{
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
			
			}finally {
	        	if(conexao != null) {
	        	conexao.close();
	        	}
	        }
	}
	
	public void editarSessao(int horas, int minutos, int segundos, int sessao) throws SQLException, ClassNotFoundException{
			try {
				conectar();
				String inserirFilmes = "UPDATE sessao SET horas = ?, minutos = ?, segundos = ?  WHERE sessao = ?";
				PreparedStatement pstmt = conexao.prepareStatement(inserirFilmes);
				pstmt.setInt(1, horas);
				pstmt.setInt(2, minutos);
				pstmt.setInt(3, segundos);
				pstmt.setInt(4, sessao);
		
				pstmt.execute();

			}finally {
	        	if(conexao != null) {
	        	conexao.close();
	        	}
	        }
	}
	public void editarPrecoIngresso(int preco) throws SQLException, ClassNotFoundException{
		try {
			conectar();
			String alterarPreco = "UPDATE sala SET preco = ? WHERE numeroSala = 1";
			PreparedStatement pstmt = conexao.prepareStatement(alterarPreco);
			pstmt.setInt(1, preco);
			
			pstmt.execute();

		}finally {
        	if(conexao != null) {
        	conexao.close();
        	}
        }
	}
}