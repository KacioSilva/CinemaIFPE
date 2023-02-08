package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Core.Filme;

class TddFilme {

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
		String sinopse = filme.getSinopse();
		assertEquals(sinopse, "sinopse");
	}
	
	@Test
	void diretorFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String diretor = filme.getDiretor();
		assertEquals(diretor, "diretor");
	}
	
	@Test
	void duracaoFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String duracao = filme.getDuracao();
		assertEquals(duracao, "160");
	}
	
	@Test
	void generoFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String acao = filme.getGenero();
		assertEquals(acao, "acao");
	}
	
	@Test
	void anoLancamentoFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String anoLancamento = filme.getAnoLancamento();
		assertEquals(anoLancamento, "1998-09-01");
	}
	
	@Test
	void classificacaoFilmeBD() throws ClassNotFoundException, SQLException {
		Filme filme = new Filme();
		filme.pegarFilmes(1);
		String classificacaoIndicativa = filme.getClassIndicativa();
		assertEquals(classificacaoIndicativa, "16");
		
	}

}
