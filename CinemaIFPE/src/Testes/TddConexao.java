package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Core.Administrador;
import Core.Filme;
import Core.Lanche;
import Database.Conexao;

class TddConexao {

	@Test
	void estaConectado() {
		Conexao conexao = new Conexao();
		boolean teste = conexao.estaConectado();

		assertEquals(false, teste);
	}
	
	@Test
	void naoEstaConectado() {
		Conexao conexao = new Conexao();
		try {
			conexao.conectar();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		boolean teste = conexao.estaConectado();
		assertEquals(true, teste);
	}
}
