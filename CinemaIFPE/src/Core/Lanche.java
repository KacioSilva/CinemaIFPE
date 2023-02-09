package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Conexao;
import Database.DatabaseLanche;

public class Lanche {
    private static int idLanche;
    private static String nome;
    private static String marca;
    private static String preco;
    private static String caminhoFoto;
    private DatabaseLanche pegarLanche = new DatabaseLanche();
    
    private static int precoTotal;
    
    public static int getPrecoTotal() {
    	return precoTotal;
    }
    
    public static void setPrecoTotal(int preco) {
    	precoTotal = preco;
    }
    
    public String getCaminhoFoto() {
		return caminhoFoto;
	}

	public static void setCaminhoFoto(String caminhoFotoLanche) {
		caminhoFoto = caminhoFotoLanche;
	}


	private static Connection conexao = null;
    private ArrayList<String> arrayLanche = new ArrayList<String>();

    public static int getIdLanche() {
        return idLanche;
    }

    public static void setIdLanche(int idLancheLanche) {
        idLanche = idLancheLanche;
    }

    public String getNomeLanche() {
        return nome;
    }

    public static void setNomeLanche(String nomeLanche) {
        nome = nomeLanche;
    }

    public String getMarca() {
        return marca;
    }

    public static void setMarca(String marcaLanche) {
        marca = marcaLanche;
    }

    public String getPreco() {
        return preco;
    }

    public static void setPreco(String precoLanche) {
        preco = precoLanche;
    }

    public int multiplicacaoLanche(int valor) {
    	Integer precoLanche = Integer.parseInt(preco);
    	return precoLanche * valor;
    }
    public int subtracaoLanche(int valor) {
    	Integer precoLanche = Integer.parseInt(preco);
    	return precoLanche + precoLanche * valor - precoLanche;
    }
 
      
    public void pegarLanche(int idlancheh) throws SQLException, ClassNotFoundException {
    	pegarLanche.pegarLanche(idlancheh);
    }
    
    public String buscarFotoLanche(int idLanche) throws SQLException, ClassNotFoundException{
    	return pegarLanche.buscarFotoLanche(idLanche);
    }
}