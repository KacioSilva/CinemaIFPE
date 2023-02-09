package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseFuncionario {
	 public boolean login(String usuario, String senha) throws SQLException, ClassNotFoundException {
		 Conexao conexao = new Conexao();	
       try {
    	   conexao.conectar();
          
           PreparedStatement statement = conexao.getConexao().prepareStatement("select usuario, senha from funcionario where  usuario = ? and senha = ?");
  
           if (!"ADMAdmaDmadMADmaDMAdM".contains(usuario)) {
        	   statement.setString(1, usuario); 
               statement.setString(2, senha);
               
               ResultSet resultSet = statement.executeQuery();
               
        	   
           }
           ResultSet resultSet = statement.executeQuery();
           return resultSet.next();
          
       } 	finally {
           		conexao.getConexao().close();
       		}
   }
	 
	 
	 public void updateSenhaADM(String usuario, String senha) throws SQLException, ClassNotFoundException{			 
		 Conexao conexao = new Conexao();
		 
				try {
					conexao.conectar();
					String inserirFilmes = "UPDATE funcionario SET senha = ? WHERE usuario = ?";
					PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserirFilmes);
					pstmt.setString(1, senha);
					pstmt.setString(2, usuario);
				
					pstmt.execute();

				}finally {
		        	if(conexao != null) {
		        		conexao.getConexao().close();
		        	}
		       }
	 }
	 
	 
}


