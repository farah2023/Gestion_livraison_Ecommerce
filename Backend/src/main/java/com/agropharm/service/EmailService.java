package com.agropharm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    // Fix: Use SLF4J Logger, not java.util.logging.Logger
    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender mailSender;

    public boolean sendEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("abarraomar@gmail.com");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);

        try {
            mailSender.send(message);
            // Fix: Add the toEmail parameter to the log message
            logger.info("Email sent successfully to: {}", toEmail);
            return true;
        } catch (MailException e) {
            // Fix: Use proper SLF4J error logging
            logger.error("Failed to send email to: {}", toEmail, e);
            return false;
        }
    }
}