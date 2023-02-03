package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Core.ControlePoltrona;


public class SelectPoltronas {
	
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
					
					PoltronaLivreS1 = rs.getString("PoltronaLivreS1");
					PoltronaLivreS2 = rs.getString("PoltronaLivreS2");
					PoltronaLivreS3 = rs.getString("PoltronaLivreS3");
					PoltronaLivreS4 = rs.getString("PoltronaLivreS4");
					PoltronaLivreS5 = rs.getString("PoltronaLivreS5");
					PoltronaLivreS6 = rs.getString("PoltronaLivreS6");				
				}		  			
			  
				
				if(i.equals("A1")) {
					ControlePoltrona.setPoltronaLivreS1(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6(PoltronaLivreS6);
				}
				if(i.equals("A2")) {
					ControlePoltrona.setPoltronaLivreS1A2(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2A2(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3A2(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4A2(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5A2(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6A2(PoltronaLivreS6);
				}
				if(i.equals("A3")) {
					ControlePoltrona.setPoltronaLivreS1A3(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2A3(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3A3(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4A3(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5A3(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6A3(PoltronaLivreS6);
				}
				if(i.equals("A4")) {
					ControlePoltrona.setPoltronaLivreS1A4(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2A4(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3A4(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4A4(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5A4(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6A4(PoltronaLivreS6);
				}
				if(i.equals("A5")) {
					ControlePoltrona.setPoltronaLivreS1A5(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2A5(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3A5(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4A5(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5A5(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6A5(PoltronaLivreS6);
				}
				if(i.equals("B1")) {
					ControlePoltrona.setPoltronaLivreS1B1(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2B1(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3B1(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4B1(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5B1(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6B1(PoltronaLivreS6);
				}
				if(i.equals("B2")) {
					ControlePoltrona.setPoltronaLivreS1B2(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2B2(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3B2(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4B2(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5B2(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6B2(PoltronaLivreS6);
				}
				if(i.equals("B3")) {
					ControlePoltrona.setPoltronaLivreS1B3(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2B3(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3B3(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4B3(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5B3(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6B3(PoltronaLivreS6);
				}
				if(i.equals("B4")) {
					ControlePoltrona.setPoltronaLivreS1B4(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2B4(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3B4(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4B4(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5B4(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6B4(PoltronaLivreS6);
				}
				if(i.equals("B5")) {
					ControlePoltrona.setPoltronaLivreS1B5(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2B5(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3B5(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4B5(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5B5(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6B5(PoltronaLivreS6);
				}
				if(i.equals("C1")) {
					ControlePoltrona.setPoltronaLivreS1C1(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2C1(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3C1(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4C1(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5C1(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6C1(PoltronaLivreS6);
				}
				if(i.equals("C2")) {
					ControlePoltrona.setPoltronaLivreS1C2(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2C2(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3C2(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4C2(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5C2(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6C2(PoltronaLivreS6);
				}
				if(i.equals("C3")) {
					ControlePoltrona.setPoltronaLivreS1C3(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2C3(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3C3(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4C3(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5C3(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6C3(PoltronaLivreS6);
				}
				if(i.equals("C4")) {
					ControlePoltrona.setPoltronaLivreS1C4(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2C4(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3C4(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4C4(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5C4(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6C4(PoltronaLivreS6);
				}
				if(i.equals("C5")) {
					ControlePoltrona.setPoltronaLivreS1C5(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2C5(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3C5(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4C5(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5C5(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6C5(PoltronaLivreS6);
				}
				if(i.equals("D1")) {
					ControlePoltrona.setPoltronaLivreS1D1(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2D1(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3D1(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4D1(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5D1(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6D1(PoltronaLivreS6);
				}
				if(i.equals("D2")) {
					ControlePoltrona.setPoltronaLivreS1D2(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2D2(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3D2(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4D2(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5D2(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6D2(PoltronaLivreS6);
				}
				if(i.equals("D3")) {
					ControlePoltrona.setPoltronaLivreS1D3(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2D3(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3D3(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4D3(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5D3(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6D3(PoltronaLivreS6);
				}
				if(i.equals("D4")) {
					ControlePoltrona.setPoltronaLivreS1D4(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2D4(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3D4(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4D4(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5D4(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6D4(PoltronaLivreS6);
				}
				if(i.equals("D5")) {
					ControlePoltrona.setPoltronaLivreS1D5(PoltronaLivreS1);
					ControlePoltrona.setPoltronaLivreS2D5(PoltronaLivreS2);
					ControlePoltrona.setPoltronaLivreS3D5(PoltronaLivreS3);
					ControlePoltrona.setPoltronaLivreS4D5(PoltronaLivreS4);
					ControlePoltrona.setPoltronaLivreS5D5(PoltronaLivreS5);
					ControlePoltrona.setPoltronaLivreS6D5(PoltronaLivreS6);
				}
				

			} finally {
	        	if(conexao != null) {
	            	conexao.getConexao().close();
	        }
    	}
		}
	}
