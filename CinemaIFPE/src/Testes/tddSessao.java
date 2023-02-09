package Testes;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import Core.Pagamento;
import Core.Sessao;
import Database.DatabaseSessao;

class tddSessao {

	@Test
	void pegarHora() throws ClassNotFoundException, SQLException {
		DatabaseSessao db = new DatabaseSessao();
		Sessao sessao = new Sessao();
		
		db.pegarSessao(1);
	
		
		String teste = sessao.getHoras();
		
		assertEquals("8", teste);
		
	}
	
	@Test
	void pegarnumeroSala() throws ClassNotFoundException, SQLException {
		
		DatabaseSessao db = new DatabaseSessao();
		Sessao sessao = new Sessao();
		String teste = sessao.getSala_numeroSala();
		
		assertEquals("1", teste);
	
	}
	
	@Test
	void pegarMinutos() throws ClassNotFoundException, SQLException {
		DatabaseSessao db = new DatabaseSessao();
		Sessao sessao = new Sessao();
		
		db.pegarSessao(1);
		
		
		String teste = sessao.getMinutos();
		
		assertEquals("0", teste);
	}
	
	@Test
	void pegarSegundos() throws ClassNotFoundException, SQLException {
		DatabaseSessao db = new DatabaseSessao();
		Sessao sessao = new Sessao();
		
		db.pegarSessao(1);
		
		
		String teste = sessao.getSegundos();
		
		assertEquals("0", teste);
	}
	
	

}
