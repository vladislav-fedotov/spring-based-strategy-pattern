package org.example;

import org.springframework.stereotype.Component;

import static org.example.MailType.*;

@Component
public class WelcomeMail implements MailGenerator {
    @Override
    public String generate() {
        return "welcome new client";
    }

    @Override
    public MailType getMyCode() {
        return WELCOME;
    }
}
