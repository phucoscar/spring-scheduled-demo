package com.aml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {
    @Autowired
    private JavaMailSenderImpl mailSender;

    public void sendMail(String email, String message) {
        SimpleMailMessage content = new SimpleMailMessage();
        content.setTo(email);
        content.setSubject("Message from system");
        content.setText(message);

        mailSender.send(content);
    }
}
