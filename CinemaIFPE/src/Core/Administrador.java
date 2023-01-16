package Core;

import java.sql.SQLException;
import java.util.ArrayList;

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
	public static boolean funcEditarLanche(String nome, String preco, String marca, String Quantidade, String ID) throws SQLException {
	    FuncionarioData lancheadm = new FuncionarioData();

	    if (nome.isEmpty() || preco.isEmpty() || marca.isEmpty() || Quantidade.isEmpty() || ID.isEmpty() ){
	        throw new RuntimeException("Campos vazios");
	}else{
		
		return true;
	}   
	    }
}