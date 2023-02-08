package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Core.Funcionario;
import Core.Pagamento;

class TeddPagamento {

	@Test
	void emailVazio() {
		assertThrows(RuntimeException.class, () -> Pagamento.validacao("", "", "", "", ""));
	}
	
	@Test
	void emailVazi() {
		assertThrows(RuntimeException.class, () -> Pagamento.validacao("", "", "", "", ""));
	}
	
	

}
