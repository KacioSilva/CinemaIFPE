package Core;

import java.sql.SQLException;

import Database.DatabaseFuncionario;

public class Funcionario {
	public static boolean login(String usuario, String senha) throws  ClassNotFoundException, SQLException{
		if(usuario.isBlank() || senha.isBlank()) {
			 throw new RuntimeException("Infome o usuário e a senha.");
		}
		
		DatabaseFuncionario funcionario = new DatabaseFuncionario();
		return funcionario.login(usuario, senha);
	}
}
