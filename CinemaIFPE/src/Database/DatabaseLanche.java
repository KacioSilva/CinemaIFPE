package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Core.Lanche;

public class DatabaseLanche {

	 public void pegarLanche(int idlancheh) throws SQLException, ClassNotFoundException {
	    	Conexao conexao = new Conexao();
	    	try {
	    		conexao.conectar();
				String query = "select * from lanche where idLanche = ?";
				PreparedStatement resultset = conexao.getConexao().prepareStatement(query);
				resultset.setInt(1, idlancheh);
				ResultSet rs = resultset.executeQuery();
				
				while(rs.next()){
					Lanche.setIdLanche(rs.getInt("idLanche"));
					Lanche.setNomeLanche(rs.getString("nome"));
					Lanche.setMarca(rs.getString("marca"));
					Lanche.setPreco(rs.getString("preco"));
					Lanche.setCaminhoFoto(rs.getString("caminhofoto"));
				}
		
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
