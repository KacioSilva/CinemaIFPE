package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Core.Lanche;

class TddLanche {

	@Test
	void nomeLancheBD() throws ClassNotFoundException, SQLException {
		Lanche lanche = new Lanche();
		lanche.pegarLanche(1);
		String nomeLanche = lanche.getNomeLanche();
		assertEquals(nomeLanche, "pipoca tradicional");
	}
	
	@Test
	void marcaLancheBD() throws ClassNotFoundException, SQLException {
		Lanche lanche = new Lanche();
		lanche.pegarLanche(1);
		String marcaLanche = lanche.getMarca();
		assertEquals(marcaLanche, "bokus");
	}
	void precoLancheBD() throws ClassNotFoundException, SQLException {
		Lanche lanche = new Lanche();
		lanche.pegarLanche(2);
		String precoLanche = lanche.getPreco();
		assertEquals(precoLanche, "19");
	}

}
