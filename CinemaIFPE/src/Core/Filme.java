package Core;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import Database.Conexao;
import Gui.FilmeIndividualAdm;

public class Filme{
	
	private static ArrayList<String> arrayFilmes = new ArrayList<String>();
	private String idFilme;
    private String nomeFilme;
    private String sinopse;
    private String cartaz;
    private String diretor;
    private String duracao;
    private String genero;
    private String anoLancamento;
    private String classIndicativa;
    private String trailer;
    private String nomedofilme;
	private JTextField tfcaminhofoto;
	private Filme filme;
	private String nomeArquivo;
	private String teste;
	

    
    public String getNome() {
        return nomeFilme;
    }

    public void setNome(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getCartaz() {
        return cartaz;
    }

    public void setCartaz(String cartaz) {
        this.cartaz = cartaz;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getClassIndicativa() {
        return classIndicativa;
    }

    public void setClassIndicativa(String classIndicativa) {
        this.classIndicativa = classIndicativa;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
    
    
    public void pegarFilmes(int i) throws SQLException, ClassNotFoundException{
    	Conexao conexao = new Conexao();
		try {	
				conexao.conectar();
				String query = "select * from filme where idFilme = ?";
				PreparedStatement pstm = conexao.getConexao().prepareStatement(query);
				pstm.setInt(1, i);
				ResultSet rs = pstm.executeQuery();
				while(rs.next()){
					arrayFilmes.add(rs.getString("idFilme"));
					arrayFilmes.add(rs.getString("nome"));
					 
					arrayFilmes.add(rs.getString("cartaz"));
					arrayFilmes.add(rs.getString("trailer"));
					arrayFilmes.add(rs.getString("sinopse"));
					arrayFilmes.add(rs.getString("diretor"));
					arrayFilmes.add(rs.getString("duracao"));
					arrayFilmes.add(rs.getString("genero"));
					arrayFilmes.add(rs.getString("anoLancamento"));
					arrayFilmes.add(rs.getString("classificacaoIndicativa"));  	
				}		  			
			  
				 idFilme = arrayFilmes.get(0);
				 nomeFilme = arrayFilmes.get(1);
				 cartaz = arrayFilmes.get(2);
				 trailer=  arrayFilmes.get(3);
				 sinopse = arrayFilmes.get(4);
				 diretor =arrayFilmes.get(5);
				 duracao = arrayFilmes.get(6);
				 genero =  arrayFilmes.get(7);
				 anoLancamento=  arrayFilmes.get(8);
				 classIndicativa=  arrayFilmes.get(9);
				
				
				System.out.println(arrayFilmes);
				arrayFilmes.clear();

			} catch (SQLException e) {
				throw new SQLException("Erro de conexão!");
			}
    	}
    
    public String buscarCartaz(int idFilme)  {
    	
    	Conexao conexao = new Conexao();
    	try {
			conexao.conectar();
    		String cartaz = "";
    		String comando = "select cartaz from filme where idFilme = ?";
    		PreparedStatement pstmt = conexao.getConexao().prepareStatement(comando);
    		pstmt.setInt(1,idFilme);
    		ResultSet rs = pstmt.executeQuery();
    		
    		while(rs.next()) {
    			cartaz = rs.getString(1);
    			return cartaz;
    		}
    		
    	}catch (java.sql.SQLException a) {
    		a.getMessage();
        } catch(ClassNotFoundException e) {
        	e.getMessage();
        } 
    	return cartaz;
    }
}

