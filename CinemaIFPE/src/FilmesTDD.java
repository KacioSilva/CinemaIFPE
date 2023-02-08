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
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FilmesTDD {
	 private static List<String> list = new ArrayList<String>();

public static void main(String[] args) {
	
	list.add("a");
	list.add("b");
	list.add("c");
	list.remove("a");
	
	System.out.println(list);
	}	
}