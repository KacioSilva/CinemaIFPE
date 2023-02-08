package Core;

import java.util.Properties;
import javax.activation.*;
import javax.mail.*;

import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class EnviarEmail {
	private static String mensagem = "";
	
	public static String getMensagem() {
		return mensagem;
	}
	public static void setMensagem(String mensagem1) {
		mensagem = mensagem1;
	}
	
	private String emailTo;
	
	public String getEmailTo(){
		return this.emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	
	public static void transfer_to_email(String Correo) throws AddressException, MessagingException{
		String correoEnvia = "cineifpaulista@gmail.com";
		String contrasena = "aaipyfmspffithtk";
		String mesaje = mensagem;
		
		Properties objetoPEC = new Properties();
		
		objetoPEC.put("mail.smtp.host", "smtp.gmail.com");
		objetoPEC.setProperty("mail.smtp.starttls.enable", "true");
		objetoPEC.put("mail.smtp.port", "587");
		objetoPEC.setProperty("mail.smtp.port", "587");
		objetoPEC.put("mail.smtp.user", correoEnvia);
		objetoPEC.setProperty("mail.smtp.auth", "true");
		
		Session sesion = Session.getDefaultInstance(objetoPEC);
		MimeMessage mail = new MimeMessage(sesion);
		
		
			mail.setFrom(new InternetAddress (correoEnvia));
			mail.addRecipient(Message.RecipientType.TO, new InternetAddress(Correo));
			mail.setSubject("CineIF Paulista");
			mail.setText(mesaje);
			
			Transport transporte = sesion.getTransport("smtp");
			transporte.connect(correoEnvia, contrasena);
			transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
			transporte.close();
			
			System.out.println("O envio do comprovante foi realizado.");
	}
}