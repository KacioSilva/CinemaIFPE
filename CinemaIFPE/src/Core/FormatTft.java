package Core;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;

public class FormatTft extends PlainDocument {
	
	
	public enum TipoEntrada {
    	
         CPF, NCARTAO, NOME, CVV, PRECO, DURACAO, CLASSIFICACAO;
        	
        }

        private int tamanhoMax;
        private TipoEntrada tpEntrada;
       
        public FormatTft(int tamanhoMax, TipoEntrada tpEntrada){
            this.tamanhoMax = tamanhoMax;
            this.tpEntrada = tpEntrada; 
        }

        @Override
        public void insertString(int i, String string, AttributeSet as) throws BadLocationException  {
        	
        	if(string == null || getLength() == tamanhoMax) {
        		return;
        	}
        	
        	int totalCarac = getLength() + string.length();
        	
        	String regex = "";
            switch(tpEntrada) {
//            case EMAIL:	  regex = "[^\\p{IsLatin}@.\\-_][^0-9]"; break;
            case CPF:     regex = "[^0-9]"; break;
            case NCARTAO: regex = "[^0-9]"; break;
            case NOME:    regex = "[^\\p{IsLatin} ]"; break;
            case CVV:	  regex = "[^0-9]"; break;     
            case PRECO:   regex = "[^0-9]"; break;
            case DURACAO: regex = "[^0-9]"; break;
            case CLASSIFICACAO: regex = "[^0-9]"; break;
            
            }  
            
            string = string.replaceAll(regex, "");
            
            
            if(totalCarac <= tamanhoMax) {
            	super.insertString(i, string, as);
            }else {
            	String nova = string.substring(0, tamanhoMax);
            	super.insertString(i, nova, as);
            }
            
            
        }
        
        
       
      
 	}