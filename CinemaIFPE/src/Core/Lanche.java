package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Conexao;

public class Lanche {
    private int idLanche;
    private String nome;
    private String marca;
    private String preco;
    private String quantidade;
    private String caminhoFoto;
    
    public String getCaminhoFoto() {
		return caminhoFoto;
	}

	public void setCaminhoFoto(String caminhoFoto) {
		this.caminhoFoto = caminhoFoto;
	}


	private static Connection conexao = null;
    private ArrayList<String> arrayLanche = new ArrayList<String>();

    public int getIdLanche() {
        return idLanche;
    }

    public void setIdLanche(int idLanche) {
        this.idLanche = idLanche;
    }

    public String getNomeLanche() {
        return nome;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nome = nomeLanche;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQtdEstoque(String qtdEstoque) {
        this.quantidade = qtdEstoque;
    }
    
    
    public void pegarLanche(int idlancheh) throws SQLException, ClassNotFoundException {
    	Conexao conexao = new Conexao();
    	try {
    		conexao.conectar();
			String query = "select * from lanche where idLanche = ?";
			PreparedStatement resultset = conexao.getConexao().prepareStatement(query);
			resultset.setInt(1, idlancheh);
			ResultSet rs = resultset.executeQuery();
			
			while(rs.next()){
				arrayLanche.add(rs.getString("idLanche"));
                arrayLanche.add(rs.getString("nome"));
                arrayLanche.add(rs.getString("marca"));
                arrayLanche.add(rs.getString("preco"));
                arrayLanche.add(rs.getString("quantidadeEstoque"));
                arrayLanche.add(rs.getString("caminhofoto"));
			}
			nome = arrayLanche.get(1);
			marca = arrayLanche.get(2);
			preco = arrayLanche.get(3);
			quantidade = arrayLanche.get(4);
			caminhoFoto = arrayLanche.get(5);
			
			arrayLanche.clear();
	
		}finally {
        	if(conexao != null) {
        	conexao.getConexao().close();
        	}
        }
    	
    }
    public String buscarFotoLanche(int idLanche) throws SQLException, ClassNotFoundException{

        Conexao conexao = new Conexao();
        try {
            conexao.conectar();
            String caminhoFoto = "";
            String comando = "select caminhofoto from lanche where idLanche = ?";
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(comando);
            pstmt.setInt(1,idLanche);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                caminhoFoto = rs.getString(1);
            }
            return caminhoFoto;
        }finally {
        	if(conexao != null) {
        	conexao.getConexao().close();
        	}
        }
    }
}








