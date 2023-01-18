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
    private String nomeFilme;
    private String sinopse;
    private String cartaz;
    private String diretor;
    private int duracao;
    private String genero;
    private String anoLancamento;
    private String classIndicativa;
    private String trailer;
    private static Connection conexao = null;
    
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
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
    
    
    public void pegarFilmes(String nome) throws SQLException{
		try {
				conectar();
				String query = "select * from filme where nome = ?";
				PreparedStatement resultset = conexao.prepareStatement(query);
				resultset.setString(1, nome);
				ResultSet rs = resultset.executeQuery();
				while(rs.next()){
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
				
				System.out.println(arrayFilmes);
				arrayFilmes.clear();

				
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	} 
}