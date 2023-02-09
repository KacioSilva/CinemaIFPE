package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CreateDatabase {

	private Connection conexao = null;
	
	public Connection conectar() throws SQLException, ClassNotFoundException {
		String servidor = "jdbc:mysql://localhost:3306";
		String usuario = "root";
		String senha = "Tt4189952";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(servidor, usuario, senha);
		}catch(SQLException e) {
			throw new SQLException("Erro de acesso ao banco!");
		}catch(ClassNotFoundException e1){
			throw new ClassNotFoundException("Erro inesperado!");
		} return conexao;
	}
	
	public Connection getConexao() {
		return conexao;
	}
	
	public void createBD() throws ClassNotFoundException, SQLException {
		String criarBanco = "CREATE SCHEMA IF NOT EXISTS `cineif` DEFAULT CHARACTER SET utf8"; 
		
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarBanco);
			
			pstmt.execute();
			
		} finally {
			conexao.close();
		}
	}
	
	
	public void createTableFilme() throws ClassNotFoundException, SQLException{
		String criarTabelaFilme = "CREATE TABLE IF NOT EXISTS `cineif`.`Filme` (\r\n"
				+ "  `idFilme` INT NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `nome` VARCHAR(45) NOT NULL,\r\n"
				+ "  `cartaz` VARCHAR(100) NOT NULL,\r\n"
				+ "  `trailer` VARCHAR(100) NULL,\r\n"
				+ "  `sinopse` VARCHAR(10000) NOT NULL,\r\n"
				+ "  `diretor` VARCHAR(45) NOT NULL,\r\n"
				+ "  `duracao` INT NOT NULL,\r\n"
				+ "  `genero` VARCHAR(45) NOT NULL,\r\n"
				+ "  `anoLancamento` DATE NOT NULL,\r\n"
				+ "  `classificacaoIndicativa` INT NOT NULL,\r\n"
				+ "  PRIMARY KEY (`idFilme`, `nome`))";
		
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarTabelaFilme);
			
			pstmt.execute();
			
			createTableSala();
		} finally {
			conexao.close();
		}
	}
	
	public void createTableSala() throws ClassNotFoundException, SQLException{
		String criarTableSala = "CREATE TABLE IF NOT EXISTS `cineif`.`Sala` (\r\n"
				+ "  `numeroSala` INT NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `qtd_poltronas` INT NOT NULL,\r\n"
				+ "  `preco` int not Null,\r\n"
				+ "  PRIMARY KEY (`numeroSala`))";
		
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarTableSala);
			
			pstmt.execute();
			
			createTablePoltrona();
		} finally {
			conexao.close();
		}
	}
	
	public void createTablePoltrona() throws ClassNotFoundException, SQLException {
		String criarTablePoltrona = "CREATE TABLE IF NOT EXISTS `cineif`.`Poltrona` (\r\n"
				+ "  `numeroPoltrona` VARCHAR(45) NOT NULL,\r\n"
				+ "  `Sala_numeroSala` INT NOT NULL,\r\n"
				+ "  `PoltronaLivreS1` VARCHAR(45) NULL,\r\n"
				+ "  `PoltronaLivreS2` VARCHAR(45) NULL,\r\n"
				+ "  `PoltronaLivreS3` VARCHAR(45) NULL,\r\n"
				+ "  `PoltronaLivreS4` VARCHAR(45) NULL,\r\n"
				+ "  `PoltronaLivreS5` VARCHAR(45) NULL,\r\n"
				+ "  `PoltronaLivreS6` VARCHAR(45) NULL,\r\n"
				+ "  PRIMARY KEY (`numeroPoltrona`),\r\n"
				+ "  CONSTRAINT `fk_Poltrona_Sala1`\r\n"
				+ "    FOREIGN KEY (`Sala_numeroSala`)\r\n"
				+ "    REFERENCES `cineif`.`Sala` (`numeroSala`)\r\n"
				+ "    ON DELETE NO ACTION\r\n"
				+ "    ON UPDATE NO ACTION)";
		
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarTablePoltrona);
			
			pstmt.execute();
			createTableSessao();
		} finally {
			conexao.close();
		}
	}
	
	public void createTableSessao() throws ClassNotFoundException, SQLException {
		String criarTableSessao = "CREATE TABLE IF NOT EXISTS `cineif`.`sessao` (\r\n"
				+ "  `sessao` VARCHAR(45) NOT NULL,\r\n"
				+ "  `Sala_numeroSala` INT NOT NULL,\r\n"
				+ "  `horas` INT NOT NULL,\r\n"
				+ "  `minutos` INT NULL,\r\n"
				+ "  `segundos` INT NULL,\r\n"
				+ "  PRIMARY KEY (`sessao`, `Sala_numeroSala`),\r\n"
				+ "  INDEX `fk_sessão_Sala1_idx` (`Sala_numeroSala` ASC) VISIBLE,\r\n"
				+ "  CONSTRAINT `fk_sessão_Sala1`\r\n"
				+ "    FOREIGN KEY (`Sala_numeroSala`)\r\n"
				+ "    REFERENCES `cineif`.`Sala` (`numeroSala`)\r\n"
				+ "    ON DELETE NO ACTION\r\n"
				+ "    ON UPDATE NO ACTION)";
		
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarTableSessao);
			
			pstmt.execute();
			
			createTableIngresso();
		} finally {
			conexao.close();
		}
	}
	
	
	public void createTableIngresso() throws ClassNotFoundException, SQLException {
		String criarTableIngresso = "CREATE TABLE IF NOT EXISTS `cineif`.`Ingresso` (\r\n"
				+ "  `idIngresso` INT NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `preco` INT NOT NULL,\r\n"
				+ "  `Filme_idFilme` INT NOT NULL,\r\n"
				+ "  `Filme_nome` VARCHAR(45) NOT NULL,\r\n"
				+ "  `Poltrona_Sala_numeroSala` INT NOT NULL,\r\n"
				+ "  `sessão_sessao` VARCHAR(45) NOT NULL,\r\n"
				+ "  `sessão_Sala_numeroSala` INT NOT NULL,\r\n"
				+ "  PRIMARY KEY (`idIngresso`, `Filme_idFilme`, `Filme_nome`, `Poltrona_Sala_numeroSala`, `sessão_sessao`, `sessão_Sala_numeroSala`),\r\n"
				+ "  INDEX `fk_Ingresso_Filme1_idx` (`Filme_idFilme` ASC, `Filme_nome` ASC) VISIBLE,\r\n"
				+ "  INDEX `fk_Ingresso_Poltrona1_idx` (`Poltrona_Sala_numeroSala` ASC) VISIBLE,\r\n"
				+ "  INDEX `fk_Ingresso_sessão1_idx` (`sessão_sessao` ASC, `sessão_Sala_numeroSala` ASC) VISIBLE,\r\n"
				+ "  CONSTRAINT `fk_Ingresso_Filme1`\r\n"
				+ "    FOREIGN KEY (`Filme_idFilme` , `Filme_nome`)\r\n"
				+ "    REFERENCES `cineif`.`Filme` (`idFilme` , `nome`)\r\n"
				+ "    ON DELETE NO ACTION\r\n"
				+ "    ON UPDATE NO ACTION,\r\n"
				+ "  CONSTRAINT `fk_Ingresso_Poltrona1`\r\n"
				+ "    FOREIGN KEY (`Poltrona_Sala_numeroSala`)\r\n"
				+ "    REFERENCES `cineif`.`Poltrona` (`Sala_numeroSala`)\r\n"
				+ "    ON DELETE NO ACTION\r\n"
				+ "    ON UPDATE NO ACTION,\r\n"
				+ "  CONSTRAINT `fk_Ingresso_sessão1`\r\n"
				+ "    FOREIGN KEY (`sessão_sessao` , `sessão_Sala_numeroSala`)\r\n"
				+ "    REFERENCES `cineif`.`sessao` (`sessao` , `Sala_numeroSala`)\r\n"
				+ "    ON DELETE NO ACTION\r\n"
				+ "    ON UPDATE NO ACTION)";
		
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarTableIngresso);
			
			pstmt.execute();
			
			createTableLache();
		} finally {
			conexao.close();
		}
	}
	
	public void createTableLache() throws ClassNotFoundException, SQLException {
		String criarTableLanche = "CREATE TABLE IF NOT EXISTS `cineif`.`Lanche` (\r\n"
				+ "  `idLanche` INT NOT NULL AUTO_INCREMENT,\r\n"
				+ "  `nome` VARCHAR(45) NOT NULL,\r\n"
				+ "  `marca` VARCHAR(45) NOT NULL,\r\n"
				+ "  `caminhofoto` VARCHAR(100) not null,\r\n"
				+ "  `preco` INT NOT NULL,\r\n"
				+ "  PRIMARY KEY (`idLanche`))";
		
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarTableLanche);
			
			pstmt.execute();
			
			createTableCliente();
		} finally {
			conexao.close();
		}
	}
	
	
	public void createTableCliente() throws ClassNotFoundException, SQLException {
		String criarTableCliente = "CREATE TABLE IF NOT EXISTS `cineif`.`Cliente` (\r\n"
				+ "  `cpf` CHAR(15) NOT NULL,\r\n"
				+ "  `email` varchar(100) not null,\r\n"
				+ "  PRIMARY KEY (`cpf`))";
		
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarTableCliente);
			
			pstmt.execute();
			
			createTableClienteIngresso();
		} finally {
			conexao.close();
		}
	}
	
	public void createTableClienteIngresso() throws ClassNotFoundException, SQLException {
		String criarTableClienteIngresso = "CREATE TABLE IF NOT EXISTS `cineif`.`Cliente_ingresso` (\r\n"
				+ "  `Cliente_cpf` CHAR(15) NOT NULL,\r\n"
				+ "  `Ingresso_idIngresso` INT NOT NULL,\r\n"
				+ "  `dataCompra` VARCHAR(50) NOT NULL,\r\n"
				+ "  PRIMARY KEY (`Cliente_cpf`, `Ingresso_idIngresso`),\r\n"
				+ "  INDEX `fk_Cliente_has_Ingresso_Ingresso1_idx` (`Ingresso_idIngresso` ASC) VISIBLE,\r\n"
				+ "  INDEX `fk_Cliente_has_Ingresso_Cliente1_idx` (`Cliente_cpf` ASC) VISIBLE,\r\n"
				+ "  CONSTRAINT `fk_Cliente_has_Ingresso_Cliente1`\r\n"
				+ "    FOREIGN KEY (`Cliente_cpf`)\r\n"
				+ "    REFERENCES `cineif`.`Cliente` (`cpf`)\r\n"
				+ "    ON DELETE NO ACTION\r\n"
				+ "    ON UPDATE NO ACTION,\r\n"
				+ "  CONSTRAINT `fk_Cliente_has_Ingresso_Ingresso1`\r\n"
				+ "    FOREIGN KEY (`Ingresso_idIngresso`)\r\n"
				+ "    REFERENCES `cineif`.`Ingresso` (`idIngresso`)\r\n"
				+ "    ON DELETE NO ACTION\r\n"
				+ "    ON UPDATE NO ACTION)";
		
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarTableClienteIngresso);
			
			pstmt.execute();
			
			createTableFuncionario();
		} finally {
			conexao.close();
		}
	}
	
	

	
	public void createTableFuncionario() throws ClassNotFoundException, SQLException {
		String criarTabelaFuncionario = "CREATE TABLE IF NOT EXISTS `cineif`.`funcionario` (\r\n"
				+ "  `usuario` VARCHAR(15) NOT NULL,\r\n"
				+ "  `senha` VARCHAR(45) NOT NULL,\r\n"
				+ "  PRIMARY KEY (`usuario`))\r\n"
				+ "ENGINE = InnoDB;";
		try {
			conectar();
			PreparedStatement pstmt = conexao.prepareStatement(criarTabelaFuncionario);
			pstmt.execute();
			
			
		} finally {
			conexao.close();
		}
	}
}