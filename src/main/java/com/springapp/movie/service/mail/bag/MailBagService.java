package com.springapp.movie.service.mail.bag;

import com.springapp.movie.entrys.form.BucketForm;

import javax.activation.DataSource;
import javax.mail.MessagingException;
import java.io.IOException;

public interface MailBagService {
    public void sendEmail(final String receiverEmailId,BucketForm bucketForm) throws MessagingException, IOException;
}
