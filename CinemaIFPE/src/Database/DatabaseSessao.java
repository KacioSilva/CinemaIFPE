package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Core.Sessao;

public class DatabaseSessao {
	
	
	public void pegarSessao(int i) throws SQLException, ClassNotFoundException{
    	Conexao conexao = new Conexao();
		try {	
				conexao.conectar();
				String query = "select * from sessao where sessao = ?";
				PreparedStatement pstm = conexao.getConexao().prepareStatement(query);
				pstm.setInt(1, i);
				ResultSet rs = pstm.executeQuery();
				while(rs.next()){
					Sessao.setHoras(rs.getString("horas"));
					Sessao.setMinutos(rs.getString("minutos"));
					Sessao.setSegundos(rs.getString("segundos"));
					Sessao.setSessao(rs.getString("sessao"));
					Sessao.setSala_numeroSala(rs.getString("Sala_numeroSala"));	
				
				}
			} catch (SQLException e) {
				throw new SQLException("Erro de conexão!");
			}
    	}
	
	public void pegarHora() throws SQLException, ClassNotFoundException{
    	Conexao conexao = new Conexao();
		try {	
				conexao.conectar();
				String query = "select horas from sessao";
				PreparedStatement pstm = conexao.getConexao().prepareStatement(query);
				ResultSet rs = pstm.executeQuery();
				while(rs.next()){
					Sessao.setHoras22(rs.getString("horas"));
				
				}
			} catch (SQLException e) {
				throw new SQLException("Erro de conexão!");
			}
	
    	}
}
