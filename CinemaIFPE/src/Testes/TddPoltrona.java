package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Core.ControlePoltrona;
import Core.Pagamento;
import Database.Conexao;
import Database.UpdatePoltronas;

class TddPoltrona {

	@Test
	void testeSomaValor() {
		ControlePoltrona cp = new ControlePoltrona();
		int valor = cp.soma(2);
		assertEquals(2, valor);
	}
	
	@Test
	void EditarPoltronaIDInvalido() {
		UpdatePoltronas poltronas = new UpdatePoltronas();
		
		assertThrows(SQLException.class, () -> poltronas.editarPoltronas("A1", 7, "0"));
	
	}
}
