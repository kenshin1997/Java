package com.springapp.movie.service.mail;

import javax.activation.DataSource;
import javax.mail.MessagingException;


public interface MailService {
    public void sendEmail(final String receiverEmailId,
                          final String subject, final String message) throws MessagingException;

}
