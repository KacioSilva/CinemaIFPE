package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.mysql.cj.exceptions.AssertionFailedException;

import Core.Administrador;
import Core.Funcionario;
import Database.Conexao;
import Database.DatabaseFuncionario;

class TddAdm {


	@Test
	void trueLoginAdm() {
		
		DatabaseFuncionario databaseFunc = new DatabaseFuncionario();
		boolean teste = false;
		try {
			teste = databaseFunc.login("adm", "1234");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, teste);
	}
	@Test
	void EmptyUsuarioAdm(){
		
		assertThrows(RuntimeException.class, () -> Funcionario.login("", "1234"));
	}
	
	@Test
	void EmptySenhaAdm() {
		assertThrows(RuntimeException.class, () -> Funcionario.login("adm", ""));
		
	}
	@Test
	void doubleEmptyAdm() {
		assertThrows(RuntimeException.class, () -> Funcionario.login("", ""));
		
	}
	@Test
	void userErradoAdm() {
		
		DatabaseFuncionario databaseFunc = new DatabaseFuncionario();
		boolean teste = false;
		try {
			teste = databaseFunc.login("adm1", "1234");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false, teste);

	}
	@Test
	void senhaErradaAdm() {
		DatabaseFuncionario databaseFunc = new DatabaseFuncionario();
		boolean teste = false;
		try {
			teste = databaseFunc.login("adm", "12345");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false, teste);
	}
	@Test
	void usuarioSenhaErradaAdm() {
		DatabaseFuncionario databaseFunc = new DatabaseFuncionario();
		boolean teste = false;
		try {
			teste = databaseFunc.login("adm1", "12345");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false, teste);
	}
		
}
