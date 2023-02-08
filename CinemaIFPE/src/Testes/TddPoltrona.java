package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Core.ControlePoltrona;
import Core.Pagamento;
import Database.Conexao;

class TddPoltrona {

	@Test
	void testeSomaValor() {
		ControlePoltrona cp = new ControlePoltrona();
		int valor = cp.soma(2);
		System.out.println(valor);
		assertEquals(2, valor);
	}
	
	@Test
	void pegarPoltrona() {
		ControlePoltrona cp = new ControlePoltrona();
		assertThrows(SQLException.class, () -> cp.pegarPoltronasA2("A99"));
	
	}

}
