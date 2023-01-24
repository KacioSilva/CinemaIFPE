package Core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Conexao;

public class Sessao {
    private String dataHora;
    private String sessao;
    private String Sala_numeroSala;
    
    private static ArrayList<String> arraySessao = new ArrayList<String>();
    public Sessao() {
        
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String tipoSessao) {
        this.sessao = tipoSessao;
    }
    
    public String getSala_numeroSala() {
        return Sala_numeroSala;
    }
    
    public void setSala_numeroSala(String Sala_numeroSala) {
        this.Sala_numeroSala = Sala_numeroSala;
    }
    
    
    public void pegarSessao(int i) throws SQLException, ClassNotFoundException{
    	Conexao conexao = new Conexao();
		try {	
				conexao.conectar();
				String query = "select * from sessao where sessao = ?";
				PreparedStatement pstm = conexao.getConexao().prepareStatement(query);
				pstm.setInt(1, i);
				ResultSet rs = pstm.executeQuery();
				while(rs.next()){
					arraySessao.add(rs.getString("dataHorario"));
					arraySessao.add(rs.getString("sessao"));
					arraySessao.add(rs.getString("Sala_numeroSala"));	
				}
				dataHora = arraySessao.get(0);
				sessao = arraySessao.get(1);
				Sala_numeroSala = arraySessao.get(2);
				
				
				System.out.println(arraySessao);
				arraySessao.clear();

			} catch (SQLException e) {
				throw new SQLException("Erro de conexão!");
			}
	
    	}
}
