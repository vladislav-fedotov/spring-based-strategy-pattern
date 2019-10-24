package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public interface MailGenerator {
    String generate();
    MailType getMyCode();

    @Autowired
    default void registerMyself(MailSender mailSender) {
        mailSender.register(getMyCode(), this);
    }
}
