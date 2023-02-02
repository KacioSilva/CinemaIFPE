package Core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Conexao;

public class Sessao {
    private String horas;
    private String minutos;
    private String segundos;
    private String sessao;
    private String Sala_numeroSala;
    
    private String teste;
    
    private static ArrayList<String> arraySessao = new ArrayList<String>();
    private static ArrayList<String> arrayHora = new ArrayList<String>();
    
    public ArrayList getHoras22() {
    	System.out.println(arrayHora);
    	return this.arrayHora;
  
    }
    public Sessao() {
        
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }
    
    public String getMinutos() {
    	return minutos;
    }
    public void setMinutos(String minutos) {
    	this.minutos = minutos;
    }
    public String getSegundos() {
    	return segundos;
    }
    public void setSegundos(String segundos) {
    	this.segundos = segundos;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String Sessao) {
        this.sessao = Sessao;
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
					arraySessao.add(rs.getString("horas"));
					arraySessao.add(rs.getString("minutos"));
					arraySessao.add(rs.getString("segundos"));
					arraySessao.add(rs.getString("sessao"));
					arraySessao.add(rs.getString("Sala_numeroSala"));	
				
				}
				horas = arraySessao.get(0);
				minutos = arraySessao.get(1);
				segundos = arraySessao.get(2);
				sessao = arraySessao.get(3);
				Sala_numeroSala = arraySessao.get(4);
				
				arraySessao.clear();

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
					arrayHora.add(rs.getString("horas"));
				
				}
				System.out.println(arrayHora);
				arraySessao.clear();

			} catch (SQLException e) {
				throw new SQLException("Erro de conexão!");
			}
	
    	}
}