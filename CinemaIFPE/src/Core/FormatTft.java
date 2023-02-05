package Core;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;

public class FormatTft extends PlainDocument {


        private int tamanhoMax;

        public FormatTft(int tamanhoMax){
            this.tamanhoMax = tamanhoMax;
        }


        @Override
        public void insertString(int posicao, String texto, AttributeSet evitar) throws BadLocationException  {

                if (texto == null) return;

                 String stringAntiga = getText (0, getLength() );
                 int tamanhoNovo = stringAntiga.length() + texto.length(); 

                 if (tamanhoNovo <= tamanhoMax) {
                     super.insertString(posicao, texto , evitar);
                     super.insertString(posicao, "", evitar); 
                 }
        }
        
        
        public  void formatarLancamento(JFormattedTextField textLancamento) throws ParseException {
				MaskFormatter mascara = new MaskFormatter("####-##-##");
				mascara.install(textLancamento);
	    }
      
 	}