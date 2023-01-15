package Core;

import java.sql.SQLException;

import Database.FuncionarioData;
//
public class Administrador {
	public static boolean login(String usuario, String senha){
        if(usuario.equals("adm")  && senha.equals("123")){
                return true;
        }
        else{
        	throw new RuntimeException("Usuário ou senha incorretos");
         }
	}
	
	public static boolean funcEditarLanche(String nome, String preco, String marca, String Quantidade, String ID) throws SQLException {
	    //FuncionarioData lancheadm = new FuncionarioData();

	    if (nome.isEmpty() || preco.isEmpty() || marca.isEmpty() || Quantidade.isEmpty() || ID.isEmpty() ){
	        throw new RuntimeException("Campos vazios");
	}else{
		
		return true;
	}  
	    }//lancheadm.editarGeral(Integer.parseInt(ID),nome,marca,Integer.parseInt(preco),Integer.parseInt(Quantidade));
	}     	



