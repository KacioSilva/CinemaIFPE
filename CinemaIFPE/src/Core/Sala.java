package Core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Conexao;

public class Sala {
	 private ArrayList<Integer> arraySala = new ArrayList<Integer>();
	 
    private int preco;

    public int getPreco() {
    	return this.preco;
    }
    public void setPreco(int preco) {
    	this.preco = preco;
    }
    
    public void pegarPreco() throws SQLException, ClassNotFoundException {
    	Conexao conexao = new Conexao();
    	try {
    		conexao.conectar();
			String query = "select preco from sala where numeroSala = 1";
			PreparedStatement resultset = conexao.getConexao().prepareStatement(query);
			ResultSet rs = resultset.executeQuery();
			
			while(rs.next()){
                arraySala.add(rs.getInt("preco"));
			}
			preco = arraySala.get(0);	
			
			System.out.println(arraySala);
			arraySala.clear();
			
			
	
		}finally {
        	if(conexao != null) {
        	conexao.getConexao().close();
        	}
        }
    }
}