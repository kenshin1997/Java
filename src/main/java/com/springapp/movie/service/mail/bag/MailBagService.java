package com.springapp.movie.service.mail.bag;

import com.springapp.movie.entrys.form.BucketForm;

import javax.activation.DataSource;
import javax.mail.MessagingException;
import java.io.IOException;

public interface MailBagService {
    public void sendEmail(final String receiverEmailId,
                          final String subject, final String message, BucketForm bucketForm) throws MessagingException, IOException;
}
