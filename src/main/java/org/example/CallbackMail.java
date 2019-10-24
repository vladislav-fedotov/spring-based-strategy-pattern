package org.example;

import org.springframework.stereotype.Component;

import static org.example.MailType.*;

@Component
public class CallbackMail implements MailGenerator {
    @Override
    public String generate() {
        return "don't call us we call you";
    }

    @Override
    public MailType getMyCode() {
        return CALLBACK;
    }
}
