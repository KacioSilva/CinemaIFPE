import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import Core.Administrador;
import Core.ControlePoltrona;
import Core.Filme;
import Core.Funcionario;
import Core.Lanche;
import Core.Sala;
import Core.Sessao;
import Database.Conexao;
import Database.CreateDatabase;
import Database.CreateInserts;
import Database.DatabaseFilmes;
import Database.DatabaseFuncionario;
import Database.DatabaseReciboIgresso;
import Database.UpdatePoltronas;
import Gui.TelaInicial;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FilmesTDD {
	 private static List<String> list = new ArrayList<String>();

public static void main(String[] args) {
	
	DatabaseReciboIgresso recibo = new DatabaseReciboIgresso();

	
	

	}
}