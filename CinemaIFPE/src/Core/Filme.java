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
import Database.DatabaseFilmes;
import Gui.EditFilme;
import java.lang.NullPointerException;

public class Filme{
	
	private static ArrayList<String> arrayFilmes = new ArrayList<String>();
	
	private static String idFilme;
	private static String nomeFilme;
    private static String sinopse;
    private static String cartaz;
    private static String diretor;
    private static String duracao;
    private static String genero;
    private static String anoLancamento;
    private static String classIndicativa;
    private static String trailer;
    private String nomedofilme;
	private JTextField tfcaminhofoto;
	private Filme filme;
	private String nomeArquivo;
	private DatabaseFilmes select = new DatabaseFilmes();

	
	private static int valorTotal;
	
	
	public static void setIdFilme(String idFilme) {
		Filme.idFilme = idFilme;
	}

	public static int getValorTotal() {
		return valorTotal;
	}
	public static void setValorTotal(int valor) {
		valorTotal = valor;
	}
    
    public String getNome() {
        return nomeFilme;
    }

    public static void setNome(String nomeFilme) {
        Filme.nomeFilme = nomeFilme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public static void setSinopse(String sinopse) {
        Filme.sinopse = sinopse;
    }

    public String getCartaz() {
        return cartaz;
    }

    public static void setCartaz(String cartaz) {
        Filme.cartaz = cartaz;
    }

    public String getDiretor() {
        return diretor;
    }

    public static void setDiretor(String diretor) {
        Filme.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public static void setDuracao(String duracao) {
        Filme.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Filme.genero = genero;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public static void setAnoLancamento(String anoLancamento) {
        Filme.anoLancamento = anoLancamento;
    }

    public String getClassIndicativa() {
        return classIndicativa;
    }

    public static void setClassIndicativa(String classIndicativa) {
        Filme.classIndicativa = classIndicativa;
    }

    public String getTrailer() {
        return trailer;
    }

    public static void setTrailer(String trailer) {
        Filme.trailer = trailer;
    }
    
    
    public void pegarFilmes(int i) throws SQLException, ClassNotFoundException{
    	
    	
    	select.selectFilmes(i);
		
    	}
    
    public String buscarCartaz(int idFilme) throws ClassNotFoundException, SQLException  {
    	return select.buscarCartaz(idFilme);
        
    }
}
