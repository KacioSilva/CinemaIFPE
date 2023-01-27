package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Core.ControlePoltrona;


public class SelectPoltronas {
	public String nome;
	public String PoltronaLivreS1;
	public String PoltronaLivreS2;
	public String PoltronaLivreS3;
	public String PoltronaLivreS4;
	public String PoltronaLivreS5;
	public String PoltronaLivreS6;
	ControlePoltrona control = new ControlePoltrona();
	
	
	public void pegarPoltronas(String i) throws SQLException, ClassNotFoundException{
    	Conexao conexao = new Conexao();
		try {	
				conexao.conectar();
				String query = "select * from poltrona where numeroPoltrona = ?";
				PreparedStatement pstm = conexao.getConexao().prepareStatement(query);
				pstm.setString(1, i);
				ResultSet rs = pstm.executeQuery();
				while(rs.next()) {
					nome = rs.getString("numeroPoltrona");
					PoltronaLivreS1 = rs.getString("PoltronaLivreS1");
					PoltronaLivreS2 = rs.getString("PoltronaLivreS2");
					PoltronaLivreS3 = rs.getString("PoltronaLivreS3");
					PoltronaLivreS4 = rs.getString("PoltronaLivreS4");
					PoltronaLivreS5 = rs.getString("PoltronaLivreS5");
					PoltronaLivreS6 = rs.getString("PoltronaLivreS6");				
				}		  			
			  
				
				if(i.equals("A1")) {
					ControlePoltrona.setNome(nome);
					ControlePoltrona.setPoltronaLivreS1(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6(PoltronaLivreS6);
				}
				if(i.equals("A2")) {
					ControlePoltrona.setNome2(nome);
					ControlePoltrona.setPoltronaLivreS1A2(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2A2(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3A2(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4A2(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5A2(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6A2(PoltronaLivreS6);
				}
				
				

				

			} catch (SQLException e) {
				throw new SQLException("Erro de conexão!");
			}
    	}
}
