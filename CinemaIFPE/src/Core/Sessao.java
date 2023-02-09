package Core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Conexao;
import Database.DatabaseSessao;

public class Sessao {
    private static String horas;
    private static String minutos;
    private static String segundos;
    private static String sessao;
    private static String Sala_numeroSala;
    private DatabaseSessao dataSesao = new DatabaseSessao();
    private static ArrayList<String> arraySessao = new ArrayList<String>();
    private static ArrayList<String> arrayHora = new ArrayList<String>();
    
    
    public static void setHoras22(String hora) {
    	arrayHora.add(hora);
    }

    public String getHoras() {
        return horas;
    }

    public static void setHoras(String horas) {
        Sessao.horas = horas;
    }
    
    public String getMinutos() {
    	return minutos;
    }
    public static void setMinutos(String minutos) {
    	Sessao.minutos = minutos;
    }
    public String getSegundos() {
    	return segundos;
    }
    public static void setSegundos(String segundos) {
    	Sessao.segundos = segundos;
    }

    public String getSessao() {
        return sessao;
    }

    public static void setSessao(String sessao) {
        Sessao.sessao = sessao;
    }
    
    public String getSala_numeroSala() {
        return Sala_numeroSala;
    }
    
    public static void setSala_numeroSala(String Sala_numeroSala) {
        Sessao.Sala_numeroSala = Sala_numeroSala;
    }
    
    public void pegarSessao(int i) throws SQLException, ClassNotFoundException{
    	dataSesao.pegarSessao(i);
    }
    
    public void pegarHora() throws SQLException, ClassNotFoundException{
    	dataSesao.pegarHora();
    }
}