package Core;

import java.util.Properties;
import javax.activation.*;
import javax.mail.*;

import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class ClasseEnvioCorreio {
	
	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Digite: ");
		int x = JOptionPane.showConfirmDialog(null, "desea enviar um correo", "enviando correo...", JOptionPane.PLAIN_MESSAGE);
		if(x==0) {
			transfer_to_email(mail);
			JOptionPane.showMessageDialog(null, "que tenga um buen dia");
			
		}else {
			JOptionPane.showMessageDialog(null, "gracias por utilizar esta porcaria");
		}
	}

	public static void transfer_to_email(String Correo) {
		String correoEnvia = "cineifp@gmail.com";
		String contrasena = "btbgcrjnomspjzyl";
		String mesaje = " Prueba de Envio de CORREO 18:18 ";
		
		Properties objetoPEC = new Properties();
		
		objetoPEC.put("mail.smtp.host", "smtp.gmail.com");
		objetoPEC.setProperty("mail.smtp.starttls.enable", "true");
		objetoPEC.put("mail.smtp.port", "587");
		objetoPEC.setProperty("mail.smtp.port", "587");
		objetoPEC.put("mail.smtp.user", correoEnvia);
		objetoPEC.setProperty("mail.smtp.auth", "true");
		
		Session sesion = Session.getDefaultInstance(objetoPEC);
		MimeMessage mail = new MimeMessage(sesion);
		
		try {
			mail.setFrom(new InternetAddress (correoEnvia));
			mail.addRecipient(Message.RecipientType.TO, new InternetAddress(Correo));
			mail.setSubject("Olá, chupe minhas bolas");
			mail.setText(mesaje);
			
			Transport transporte = sesion.getTransport("smtp");
			transporte.connect(correoEnvia, contrasena);
			transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
			transporte.close();
			
			System.out.println("El email se envio corretamente");
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
