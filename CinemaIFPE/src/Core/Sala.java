package Core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Conexao;

public class Sala {
	 private ArrayList<String> arraySala = new ArrayList<String>();
	 
    private String numero;
    private String qtdPoltronas;
    private String preco;


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getQtdPoltronas() {
        return qtdPoltronas;
    }

    public void setQtdPoltronas(String qtdPoltronas) {
        this.qtdPoltronas = qtdPoltronas;
    }
    public String getPreco() {
    	return this.preco;
    }
    public void setPreco(String preco) {
    	this.preco = preco;
    }
    
    public void pegarPreco() throws SQLException, ClassNotFoundException {
    	Conexao conexao = new Conexao();
    	try {
    		conexao.conectar();
			String query = "select * from sala where numeroSala = 1";
			PreparedStatement resultset = conexao.getConexao().prepareStatement(query);
			ResultSet rs = resultset.executeQuery();
			
			while(rs.next()){
				arraySala.add(rs.getString("numeroSala"));
                arraySala.add(rs.getString("qtd.poltronas"));
                arraySala.add(rs.getString("preco"));
			}
			numero = arraySala.get(0);
			qtdPoltronas = arraySala.get(1);
			preco = arraySala.get(2);	
			
			arraySala.clear();
			
	
		}finally {
        	if(conexao != null) {
        	conexao.getConexao().close();
        	}
        }
    }
}
