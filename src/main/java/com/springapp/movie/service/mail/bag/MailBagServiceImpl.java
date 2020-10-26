package com.springapp.movie.service.mail.bag;

import com.springapp.movie.entrys.form.BucketForm;
import com.springapp.movie.service.export.bag.BagExport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;

@Service
public class MailBagServiceImpl implements MailBagService{
    @Autowired
    Session mailSession;
    @Autowired
    BagExport bagExport;
    @Override
    public void sendEmail(String receiverEmailId, String subject, String message, BucketForm bucketForm) throws MessagingException, IOException {
        DataSource dataSource = bagExport.getExcelData(bucketForm);
        MimeMessage mimeMessage = new MimeMessage(mailSession);
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);
        mimeBodyPart.setDataHandler(new DataHandler(dataSource));
        mimeBodyPart.setFileName("Order.xls");
        mimeMessage.setFrom(new InternetAddress("kenshin.trifan1907@gmail.com"));
        mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(receiverEmailId));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(message);
        mimeMessage.setContent(multipart);

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
