//package Testes;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.sql.SQLException;
//
//import org.junit.jupiter.api.Test;
//
//import com.mysql.cj.exceptions.AssertionFailedException;
//
//import Core.Administrador;
//import Database.Conexao;
//
//class TddAdm {
//
//	@Test
//	void trueLoginAdm() {
//		boolean teste = Administrador.login("adm", "123");
//		assertEquals(true, teste);
//	}
//	@Test
//	void EmptyUsuarioAdm(){
//		assertThrows(RuntimeException.class, () -> Administrador.login("", "123"));
//	}
//	
//	@Test
//	void EmptySenhaAdm() {
//		assertThrows(RuntimeException.class, () -> Administrador.login("adm", ""));
//		
//	}
//	@Test
//	void doubleEmptyAdm() {
//		assertThrows(RuntimeException.class, () -> Administrador.login("", ""));
//		
//	}
//	@Test
//	void userErradoAdm() {
//		assertThrows(RuntimeException.class, () -> Administrador.login("adm1", "123"));
//		
//	}
//	@Test
//	void senhaErradaAdm() {
//		assertThrows(RuntimeException.class, () -> Administrador.login("adm", "1234"));
//	}
//	@Test
//	void usuarioSenhaErradaAdm() {
//		assertThrows(RuntimeException.class, () -> Administrador.login("adm1", "1234"));
//	}
//		
//}
