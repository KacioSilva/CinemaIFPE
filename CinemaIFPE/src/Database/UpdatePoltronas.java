package Database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Database.Conexao.*;

public class UpdatePoltronas {
	
	public UpdatePoltronas() {}
	
	public void editarPoltronas(String poltrona, String sessao) throws SQLException, ClassNotFoundException{
		Conexao conexao = new Conexao();
		try {
			conexao.conectar();
			String inserirFilmes = "UPDATE poltrona SET PoltronaLivreS1=?  WHERE sessao = ?";
			PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserirFilmes);
			pstmt.setString(1, poltrona);

			pstmt.execute();

		}finally {
        	if(conexao != null) {
        	conexao.getConexao().close();
        	}
        }
}

}
