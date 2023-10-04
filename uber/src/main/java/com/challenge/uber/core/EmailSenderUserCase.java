package com.challenge.uber.core;

public interface EmailSenderUserCase {

    void sendEmail(String to, String subject, String body);
}
