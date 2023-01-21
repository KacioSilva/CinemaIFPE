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
    private static Connection conexao = null;
    private String nomedofilme;
	private JTextField tfcaminhofoto;
	private Filme filme;
	private String nomeArquivo;
	
	
	
	

    
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
    
    
    public void pegarFilmes(int i) throws Exception{
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

			} catch (Exception e) {
				throw new Exception("Erro de conexão!");
			}
		
    	}
			public List<Imagem> findAll(){
			String query = "select * from imagem";
			List<Imagem> imagens = new ArrayList<Imagem>();	
			try {
				PreparedStatement pstm = conexao.prepareStatement(query);
				ResultSet rs = pstm.executeQuery();
				while(rs.next()){
					Imagem imagensObj = new Imagem();
					imagensObj.setIdFilme(rs.getInt("idImagem"));
					imagensObj.setNomeImagem(rs.getString("nomeFilme"));
					imagensObj.setImagem(rs.getBytes("foto"));
				}		  			
			}catch(Exception e) {
				imagens = null;
			}
			return imagens;
		}
			
			
		public boolean create(Imagem imagem){
			try {
				PreparedStatement pstm = conexao
						.prepareStatement("insert into imagem (foto, nomeImagem, Filme_idFilme, Filme_nome) values(?, ?, ?, ?)");
				pstm.setString(1, imagem.getNomeImagem());
				pstm.setBytes(2, imagem.getImagem());
				pstm.setInt(3, 1);
				pstm.setString(4, "Filme");
				return pstm.executeUpdate() > 0;
			}catch(Exception e) {
				return false;
			}
		}
}