package Core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;

import Database.Conexao;
import Database.FuncionarioData;

public class Administrador {	
	//Método para controle de acesso do adm para as áreas de controle do cinema
	
	public static boolean login(String usuario, String senha){
        if(usuario.equals("adm")  && senha.equals("123")){
                return true;
        }
        else{
        	throw new RuntimeException("Usuário ou senha incorretos");
         }
	}
	
	//Método para o funcionário editar os lanches
	
	public static boolean funcEditarLanche(String nome, String preco, String marca, String Quantidade, String ID) throws SQLException, ClassNotFoundException  {
	    Conexao lancheadm = new Conexao();
		lancheadm.conectar();

	    if (nome.isEmpty() || preco.isEmpty() || marca.isEmpty() || Quantidade.isEmpty() || ID.isEmpty() ){
	        throw new RuntimeException("Campos vazios");
	}else{
		lancheadm.editarGeral(Integer.parseInt(ID),nome,marca,Integer.parseInt(preco),Integer.parseInt(Quantidade));
		return true;
		}   
	}	
}