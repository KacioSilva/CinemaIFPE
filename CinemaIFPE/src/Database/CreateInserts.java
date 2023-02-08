package Database;
import java.sql.*;

public class CreateInserts {
	private Conexao conexao = new Conexao();
	
	public void insertSala() throws ClassNotFoundException, SQLException{
					
			String inserirSala = "insert into sala values \r\n"
					+ "(1,20, 20);";
			
			try {
				conexao.conectar();
				PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserirSala);

				pstmt.execute();
				
				insertSessao();
			} finally {
				conexao.getConexao().close();			
			}
	}
	
	public void insertSessao() throws ClassNotFoundException, SQLException{
		
		
			String inserirSessao = "INSERT INTO sessao VALUES\r\n"
					+ "(\"1\", 1, 8, 0, 0),\r\n"
					+ "(\"2\", 1, 11, 0, 0),\r\n"
					+ "(\"3\", 1, 14, 0, 0),\r\n"
					+ "(\"4\", 1, 17, 4, 1),\r\n"
					+ "(\"5\", 1, 20, 0, 0),\r\n"
					+ "(\"6\", 1, 23, 0, 0)";
			
			try {
				conexao.conectar();
				PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserirSessao);
				
				pstmt.execute();
				
				insertPoltrona();
			} finally {
				conexao.getConexao().close();
				
			}
	}
	
	public void insertPoltrona() throws ClassNotFoundException, SQLException{

			String inserirPoltrona = "insert into poltrona values\r\n"
					+ "(\"A1\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"A2\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"A3\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"A4\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"A5\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"B1\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"B2\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"B3\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"B4\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"B5\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"C1\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"C2\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"C3\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"C4\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"C5\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"D1\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"D2\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"D3\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"D4\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\"),\r\n"
					+ "(\"D5\",1,\"0\",\"0\",\"0\",\"0\",\"0\",\"0\")\r\n"
					+ "";
			
			try {
				conexao.conectar();
				PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserirPoltrona);
				
				pstmt.execute();
				
				insertFilme();
			} finally {
				conexao.getConexao().close();
				
			}
		}
	
	
	
	public void insertFilme() throws ClassNotFoundException, SQLException{
			
			String inserirFilme = "insert into filme values\r\n"
					+ "(default, \"Clube da Luta\", \"C:\\Users\\Gilva\\Downloads/Adonai.jpg\", \"trailer\", \"sinopse\", \"diretor\", 160, \"acao\", \"1998-09-01\", 16),\r\n"
					+ "(default, \"Power Ranger\", \"cartaz\", \"trailer\", \"sinopse\", \"diretor\", 160, \"acao\", \"1998-09-01\", 16),\r\n"
					+ "(default, \"Psicopata americano\", \"cartaz\", \"trailer\", \"sinopse\", \"diretor\", 160, \"acao\", \"1998-09-01\", 16),\r\n"
					+ "(default, \"Driver\", \"cartaz\", \"trailer\", \"sinopse\", \"diretor\", 160, \"acao\", \"1998-09-01\", 16),\r\n"
					+ "(default, \"Velozes e Furiosos\", \"cartaz\", \"trailer\", \"sinopse\", \"diretor\", 160, \"acao\", \"1998-09-01\", 16),\r\n"
					+ "(default, \"Festa da Salsisha\", \"cartaz\", \"trailer\", \"sinopse\", \"diretor\", 160, \"acao\", \"1998-09-01\", 16),\r\n"
					+ "(default, \"Eu sou a lenda\", \"cartaz\", \"trailer\", \"sinopse\", \"diretor\", 160, \"acao\", \"1998-09-01\", 16)";
			
			try {
				conexao.conectar();
				PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserirFilme);
				
				pstmt.execute();
				
				insertLanche();
			} finally {
				conexao.getConexao().close();
			}
		}
	
		public void insertLanche() throws ClassNotFoundException, SQLException{
			
				String inserirLanche = "insert into lanche values\r\n"
						+ "(1,    \"pipoca tradicional\",    \"bokus\", \"foto lanche\",   19),\r\n"
						+ "(2,   \"pipoca doce\",    \"bokus\",    \"foto lanche\",  25),\r\n"
						+ "(3,    \"Coca-Cola\",    \"Coca-Cola\",    \"foto lanche\",  7),\r\n"
						+ "(4,    \"Fanta Laranjada\",    \"Coca-Cola\", \"foto lanche\",  7),\r\n"
						+ "(5,    \"Barra de Chocolate\",    \"Cacau Show\", \"foto lanche\",   15);\r\n"
						+ "";
				
				try {
					conexao.conectar();
					PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserirLanche);
					
					pstmt.execute();
					insertFuncionario();
					
				} finally {
					conexao.getConexao().close();
				}
			}
		
		public void insertFuncionario() throws ClassNotFoundException, SQLException{
			String inserirFuncionario = "insert into funcionario values\r\n"
					+ "(\"adm\", \"123\")";
			try {
				conexao.conectar();
				PreparedStatement pstmt = conexao.getConexao().prepareStatement(inserirFuncionario);
				
				pstmt.execute();
				
			} finally {
				conexao.getConexao().close();
			}
		}
	}	