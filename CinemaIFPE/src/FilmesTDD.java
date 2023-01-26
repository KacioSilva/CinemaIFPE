import java.sql.Connection;
import java.sql.SQLException;
import Core.Administrador;
import Core.ControlePoltrona;
import Core.Filme;
import Core.Sessao;
import Database.Conexao;
import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class FilmesTDD {

public static void main(String[] args) throws ClassNotFoundException {
	Conexao conexao = new Conexao();
	Filme filme = new Filme();
	Sessao sessao = new Sessao();
	
	
	ControlePoltrona cp = new ControlePoltrona();
	
	cp.setPreco(20);
	
	System.out.println(cp.getPreco());
	
	try {
		
		sessao.pegarSessao(1);
	
	   // conexao.editarFilme();
	  //  Administrador.funcEditarFilme("1", "kacio", "cartaz", "teste1", "teste2", "teste3", "225", "teste5", "2004/05/29", "18");
	
		LocalTime tNow = LocalTime.now();
		
		int horas = Integer.parseInt(sessao.getHoras());
		int minutos = Integer.parseInt(sessao.getMinutos());
		int segundos = Integer.parseInt(sessao.getSegundos());
		
		LocalTime t = LocalTime.of(horas, minutos, segundos);
		Duration between = Duration.between(tNow, t);
		if(between.isNegative()) {
		//	System.out.println("negativo");
		}
		else {
			//System.out.println("positivo");
		}
		//System.out.println(between);
			
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	    }
	}