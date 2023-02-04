package Core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Conexao;
import Database.UpdatePoltronas;
import Gui.SelecaoPoltronas;
import Gui.TelaInicial;

public class Sala {
	 private ArrayList<Integer> arraySala = new ArrayList<Integer>();
	 
    private int preco;

    public int getPreco() {
    	return this.preco;
    }
    public void setPreco(int preco) {
    	this.preco = preco;
    }
    
    public void pegarPreco() throws SQLException, ClassNotFoundException {
    	Conexao conexao = new Conexao();
    	
    	try {
    		conexao.conectar();
			String query = "select preco from sala where numeroSala = 1";
			PreparedStatement resultset = conexao.getConexao().prepareStatement(query);
			ResultSet rs = resultset.executeQuery();
			
			while(rs.next()){
                arraySala.add(rs.getInt("preco"));
			}
			preco = arraySala.get(0);	
			
			System.out.println(arraySala);
			arraySala.clear();
	
		}finally {
        	if(conexao != null) {
        	conexao.getConexao().close();
        	}
        }
    }
    public void resetarPoltronas(int id) throws SQLException, ClassNotFoundException{
    	UpdatePoltronas upPoltrona = new UpdatePoltronas();
    	Conexao conexao = new Conexao();

    	try {
    		conexao.conectar();
    		
    		SelecaoPoltronas.setA1Set("0");
    		SelecaoPoltronas.setA2Set("0");
    		SelecaoPoltronas.setA3Set("0");
    		SelecaoPoltronas.setA4Set("0");
    		SelecaoPoltronas.setA5Set("0");
    		
    		SelecaoPoltronas.setB1Set("0");
    		SelecaoPoltronas.setB2Set("0");
    		SelecaoPoltronas.setB3Set("0");
    		SelecaoPoltronas.setB4Set("0");
    		SelecaoPoltronas.setB5Set("0");
    		
    		SelecaoPoltronas.setC1Set("0");
    		SelecaoPoltronas.setC2Set("0");
    		SelecaoPoltronas.setC3Set("0");
    		SelecaoPoltronas.setC4Set("0");
    		SelecaoPoltronas.setC5Set("0");
    		
    		SelecaoPoltronas.setD1Set("0");
    		SelecaoPoltronas.setD2Set("0");
    		SelecaoPoltronas.setD3Set("0");
    		SelecaoPoltronas.setD4Set("0");
    		SelecaoPoltronas.setD5Set("0");
    		
			upPoltrona.editarPoltronas("A1", id, SelecaoPoltronas.getA1Set());
			upPoltrona.editarPoltronas("A2", id, SelecaoPoltronas.getA2Set());
			upPoltrona.editarPoltronas("A3", id, SelecaoPoltronas.getA3Set());
			upPoltrona.editarPoltronas("A4", id, SelecaoPoltronas.getA4Set());
			upPoltrona.editarPoltronas("A5", id, SelecaoPoltronas.getA5Set());
			
					
			upPoltrona.editarPoltronas("B1", id, SelecaoPoltronas.getB1Set());							
			upPoltrona.editarPoltronas("B2", id, SelecaoPoltronas.getB2Set());								
			upPoltrona.editarPoltronas("B3", id, SelecaoPoltronas.getB3Set());							
			upPoltrona.editarPoltronas("B4", id, SelecaoPoltronas.getB4Set());								
			upPoltrona.editarPoltronas("B5", id, SelecaoPoltronas.getB5Set());
			
						
			upPoltrona.editarPoltronas("C1", id, SelecaoPoltronas.getC1Set());									
			upPoltrona.editarPoltronas("C2", id, SelecaoPoltronas.getC2Set());					
			upPoltrona.editarPoltronas("C3", id, SelecaoPoltronas.getC3Set());									
			upPoltrona.editarPoltronas("C4", id, SelecaoPoltronas.getC4Set());								
			upPoltrona.editarPoltronas("C5", id, SelecaoPoltronas.getC5Set());
			
						
			upPoltrona.editarPoltronas("D1", id, SelecaoPoltronas.getD1Set());									
			upPoltrona.editarPoltronas("D2", id, SelecaoPoltronas.getD2Set());									
			upPoltrona.editarPoltronas("D3", id, SelecaoPoltronas.getD3Set());									
			upPoltrona.editarPoltronas("D4", id, SelecaoPoltronas.getD4Set());									
			upPoltrona.editarPoltronas("D5", id, SelecaoPoltronas.getD5Set());
    	} 
    	finally {
        	if(conexao != null) {
        	conexao.getConexao().close();
        	}
        }
    
    }
}