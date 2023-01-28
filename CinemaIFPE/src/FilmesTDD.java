import java.sql.Connection;
import java.sql.SQLException;
import Core.Administrador;
import Core.ControlePoltrona;
import Core.Filme;
import Core.Lanche;
import Core.Sessao;
import Database.Conexao;
import Database.SelectPoltronas;
import Database.UpdatePoltronas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class FilmesTDD {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Conexao conexao = new Conexao();
	Filme filme = new Filme();
	Sessao sessao = new Sessao();	
	Lanche lanche = new Lanche();
	
	lanche.pegarLanche(1);
	System.out.println(lanche.getNomeLanche());
	}
}
	