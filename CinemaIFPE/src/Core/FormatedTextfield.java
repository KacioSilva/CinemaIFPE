package Core;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class FormatedTextfield {
	
	 public static  void formatarLancamento(JFormattedTextField textLancamento) throws ParseException {
			MaskFormatter mascara = new MaskFormatter("####-##-##");
			mascara.install(textLancamento);
 }
	 
	 public static  void formatarEmail(JFormattedTextField textEmail) throws ParseException {
			MaskFormatter mascara = new MaskFormatter("?");
			mascara.install(textEmail);
}

}
