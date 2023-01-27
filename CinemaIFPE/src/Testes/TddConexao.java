package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Core.Administrador;
import Core.Filme;
import Core.Lanche;
import Database.Conexao;

class TddConexao {

	@Test
	void estaConectado() {
		Conexao conexao = new Conexao();
		boolean teste = conexao.estaConectado();

		assertEquals(false, teste);
	}
	
	@Test
	void naoEstaConectado() {
		Conexao conexao = new Conexao();
		try {
			conexao.conectar();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		boolean teste = conexao.estaConectado();
		assertEquals(true, teste);
	}
	@Test
	void nomeFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String nome = filme.getNome();
		assertEquals(nome, "Clube da Luta");
	}
	
	@Test
	void sinopseFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String nome = filme.getSinopse();
		assertEquals(nome, "sinopse");
	}
	@Test
	void diretorFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String nome = filme.getDiretor();
		assertEquals(nome, "diretor");
	}
	@Test
	void duracaoFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String nome = filme.getDuracao();
		assertEquals(nome, "160");
	}
	@Test
	void generoFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String nome = filme.getGenero();
		assertEquals(nome, "acao");
	}
	@Test
	void anoLancamentoFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String nome = filme.getAnoLancamento();
		assertEquals(nome, "1998-09-01");
	}
	@Test
	void classificacaoFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String nome = filme.getClassIndicativa();
		assertEquals(nome, "11");
		System.out.println(nome);
	}
	
		
	@Test
	void nomeLancheBD() throws ClassNotFoundException, SQLException {
		Lanche lanche = new Lanche();
		lanche.pegarLanche(1);
		String nome = lanche.getNomeLanche();
		assertEquals(nome, "pipoca tradicional");
	}
	@Test
	void marcaLancheBD() throws ClassNotFoundException, SQLException {
		Lanche lanche = new Lanche();
		lanche.pegarLanche(1);
		String nome = lanche.getMarca();
		assertEquals(nome, "bokus");
	}
	void precoLancheBD() throws ClassNotFoundException, SQLException {
		Lanche lanche = new Lanche();
		lanche.pegarLanche(2);
		String nome = lanche.getPreco();
		assertEquals(nome, "19");
	}
	void quantidadeEstoque() throws ClassNotFoundException, SQLException {
		Lanche lanche = new Lanche();
		lanche.pegarLanche(2);
		String nome = lanche.getPreco();
		assertEquals(nome, "100");
	}
}
