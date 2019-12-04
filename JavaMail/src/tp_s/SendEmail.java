package tp_s;
import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {
		
	public void SendEmail(){}
		
		public void sendMsgMethod(String host , String from , String login , String pwd , String to){
			
			System.out.println("Host: "+host+"\nFrom: "+from+"\n To:"+to);
			
			Transport t= null;
			
			 Properties properties = System.getProperties();
			 
			 properties.setProperty("mail.smtp.host", host);
			 Session session = Session.getDefaultInstance(properties ,null);
			 MimeMessage message = new MimeMessage(session);
			 
			
			try {
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Hello it's Hamza");
			message.setText("hi this is Hamza and this is a simple text for testing");
			
			System.out.println("Tentative de connexion...");
			t = session.getTransport("smtps");
			
	        t.connect(host, login, pwd);

				
			System.out.println("Envoi de mail...");
			t.sendMessage(message , message.getAllRecipients());
			
			System.out.println("Mail envoy� avec succ�s");
		}
			catch(Exception ex) {
				ex.printStackTrace();}
		}
	public void usage() {
			System.out.println("usage : java sendMsg  <smtp> <from> <login> <pwd> <to>");
		}
		
}