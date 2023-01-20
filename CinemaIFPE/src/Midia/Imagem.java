package Midia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Core.Filme;

public class Imagem {
private byte[] imagem;
private int idFilme;
private String nomeFilme;
    
    public byte[] getImagem() {
    	return imagem;
    }
   
    public void setImagem(byte[] imagem) {
    	this.imagem = imagem;
    }
    
    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }
    public String getNomeFilme() {
    	return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
    	this.nomeFilme = nomeFilme;
    }
    
	private Connection conexao = null;
		
//		public void conectar() throws SQLException, ClassNotFoundException {
//			String servidor = "jdbc:mysql://localhost:3306/cineif";
//			String usuario = "root";
//			String senha = "Fam1l1a..";
//			String driver = "com.mysql.jdbc.Driver";
//			try {
//				Class.forName(driver);
//				conexao = DriverManager.getConnection(servidor, usuario, senha);
//			}catch(SQLException e) {
//				throw new SQLException("Erro de acesso ao banco!");			
//			}catch(ClassNotFoundException e1){
//				throw new ClassNotFoundException("Erro inesperado!");
//			}
//		}
			
//		public List<Filme> findAll(){
//		String query = "select * from imagem";
//		List<Filme> imagens = new ArrayList<Filme>();	
//		try {
//			PreparedStatement pstm = conexao.prepareStatement(query);
//			ResultSet rs = pstm.executeQuery();
//			while(rs.next()){
//				Filme filme = new Filme();
//				
//				filme.set
//				
//			  	
//			}		  			
//			
//		}
//		}catch(Exception e) {
//			imagens = null;
//			e.getMessage();
//		}
//}
