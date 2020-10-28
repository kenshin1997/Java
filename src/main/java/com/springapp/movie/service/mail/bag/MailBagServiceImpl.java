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
    public void sendEmail(String receiverEmailId, BucketForm bucketForm) throws MessagingException, IOException {
        String SUBJECT = "Multumim pentru comanda";
        String MESSAGE = "Buna ziua, va multumim pentru comanda efectuata pe resursa www.example123.md, in scurt timp cu dumneavoastra va lu-a legatura angajatul nostru " +
                "pentru a confirma comanda. \n" +
                "Informatia dumneavoastra oferita \n" +
                "Numele - " + bucketForm.getName() + "\n" +
                "Telefonul - " + bucketForm.getPhone() + "\n" +
                "Email - " + bucketForm.getEmail() + "\n" +
                "Pentru informatii adaugatoare vizitati pagina web compartamentul Despre noi rubrica -> intrebari frecvente" +
                "sau telefonatine la numarul de telefon - 079984282 Iurie";
        DataSource dataSource = bagExport.getExcelData(bucketForm);
        MimeMessage mimeMessage = new MimeMessage(mailSession);
        BodyPart messageBodyPart = new MimeBodyPart();
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);
        multipart.addBodyPart(messageBodyPart);
        messageBodyPart.setText(MESSAGE);
        mimeBodyPart.setDataHandler(new DataHandler(dataSource));
        mimeBodyPart.setFileName("Order.xls");
        mimeMessage.setFrom(new InternetAddress("kenshin.trifan1907@gmail.com"));
        mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(receiverEmailId));
        mimeMessage.setSubject(SUBJECT);
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
