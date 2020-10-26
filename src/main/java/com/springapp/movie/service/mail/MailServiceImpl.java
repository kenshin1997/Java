package com.springapp.movie.service.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;



@Service("mailService")
public class MailServiceImpl implements MailService  {

    @Autowired
    Session mailSession;

    @Override
    public void sendEmail(String receiverEmailId, String subject, String message) throws MessagingException {
        MimeMessage mimeMessage = new MimeMessage(mailSession);
        mimeMessage.setFrom(new InternetAddress("kenshin.trifan1907@gmail.com"));
        mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(receiverEmailId));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(message);
        try {
            Transport.send(mimeMessage);
            System.out.println("Email sent");
        }
        catch (Exception exe){
            System.out.println("Email service error");
            exe.printStackTrace();
        }
    }


}
