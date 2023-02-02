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
	Sessao sessao = new Sessao();	
	sessao.pegarHora();
//	sessao.getHoras22();
	sessao.getHoras22().forEach(adonai -> System.out.println(adonai));
	}
}
	