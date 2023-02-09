package Database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseReciboIgresso {
	private Conexao conexao = new Conexao();
	
	public void insertIngresso(int preco, int idFilme, String nomeFilme, String poltrona, String sessao,
			String horaCompra) throws ClassNotFoundException, SQLException{
	
		try {
			conexao.conectar();
			String inserirIngresso = "insert into ingresso (preco, Filme_idFilme, "
					+ "Filme_nome, Poltrona, sessao, numeroSala, horaCompra) values (?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserirIngresso);
			pstmt.setInt(1, preco);
			pstmt.setInt(2, idFilme);
			pstmt.setString(3, nomeFilme);
			pstmt.setString(4, poltrona);
			pstmt.setString(5, sessao);
			pstmt.setInt(6, 1);
			pstmt.setString(7, horaCompra);

			
			pstmt.execute();
			
		} finally {
			conexao.getConexao().close();			
		}	
	}
}
