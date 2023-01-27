package Database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Database.Conexao.*;

public class UpdatePoltronas {
	private String poltronas;
	
	
	public void editarPoltronas(String numeroPoltrona, int id, String ocupado) throws SQLException, ClassNotFoundException{
		Conexao conexao = new Conexao();

		if(id == 1) {
			poltronas = "PoltronaLivreS1";
		}
		else if(id == 2) {
			poltronas = "PoltronaLivreS2";
		}
		else if(id == 3) {
			poltronas = "PoltronaLivreS3";
		}
		else if(id == 4) {
			poltronas = "PoltronaLivreS4";
		}
		else if(id == 5) {
			poltronas = "PoltronaLivreS5";
		}
		else if(id == 6) {
			poltronas = "PoltronaLivreS6";
		}
		
		try {
			conexao.conectar();
			String zerarPoltronas = "UPDATE poltrona SET " +  poltronas + "=? WHERE numeroPoltrona = ?";
			PreparedStatement pstmt = conexao.getConexao().prepareStatement(zerarPoltronas);
			pstmt.setString(1, ocupado);
			pstmt.setString(2, numeroPoltrona);
			
			
			pstmt.execute();
			
			

		}finally {
        	if(conexao != null) {
        	conexao.getConexao().close();
        	}
        }
	}
}