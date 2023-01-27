import java.sql.Connection;
import java.sql.SQLException;
import Core.Administrador;
import Core.ControlePoltrona;
import Core.Filme;
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
	
	
	ControlePoltrona cp = new ControlePoltrona();
	
	cp.setPreco(20);
	
	System.out.println(cp.getPreco());
	UpdatePoltronas update = new UpdatePoltronas();
	update.editarPoltronas("A1", 6, "1");
	
	}
}
	