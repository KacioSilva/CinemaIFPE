import java.sql.Connection;
import java.sql.SQLException;
import Core.Administrador;
import Core.ControlePoltrona;
import Core.Filme;
import Core.Lanche;
import Core.Sala;
import Core.Sessao;
import Database.Conexao;
import Database.SelectPoltronas;
import Database.UpdatePoltronas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FilmesTDD {

public static void main(String[] args) {
	
	Conexao conexao = new Conexao();
	Sala sala = new Sala();
	try {
		sala.pegarPreco();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	
}