import java.sql.Connection;
import java.sql.SQLException;

import Core.Administrador;
import Core.Filme;
import Core.Sessao;
import Database.Conexao;

public class FilmesTDD {

public static void main(String[] args) throws ClassNotFoundException {
	Conexao conexao = new Conexao();
	Filme filme = new Filme();
	Sessao sessao = new Sessao();
	try {
		
		sessao.pegarSessao(1);
	
	   // conexao.editarFilme();
	  //  Administrador.funcEditarFilme("1", "kacio", "cartaz", "teste1", "teste2", "teste3", "225", "teste5", "2004/05/29", "18");
	
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	    }
	}