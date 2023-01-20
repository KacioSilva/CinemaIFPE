package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Database.Conexao;

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
    
    public String getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(String idFilme) {
        this.idFilme = idFilme;
    }
    
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
    
    public void conectar() throws SQLException, ClassNotFoundException {
		String servidor = "jdbc:mysql://localhost:3306/cineif";
		String usuario = "root";
		String senha = "Tt4189952";
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
    
    
    public void pegarFilmes(int i) throws SQLException{
		try {
				conectar();
				String query = "select * from filme where idFilme = ?";
				PreparedStatement resultset = conexao.prepareStatement(query);
				resultset.setInt(1, i);
				ResultSet rs = resultset.executeQuery();
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

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	} 
}