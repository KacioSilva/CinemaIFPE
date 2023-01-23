package Core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Database.Conexao;

public class ControlePoltrona {
   private String nome;
   private int preco = 0;
    
   
    
    
public String getNome() {
	return nome;
}




public void setNome(String nome) {
	this.nome = nome;
}




public int getPreco() {
	return preco;
}




public void setPreco(int preco) {
	this.preco = preco;
}



public void subtracao(int preco) {
	this.preco -= preco;
}

public void soma(int preco) {
	this.preco += preco;
}
    
    
    
    
    
    
    
    
}

