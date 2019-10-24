package org.example;

import org.springframework.stereotype.Component;

import static org.example.MailType.*;

@Component
public class JokerInfoMail implements MailGenerator {
    @Override
    public String generate() {
        return "приходите завтра в 9 вечера, будет сюрприз";
    }

    @Override
    public MailType getMyCode() {
        return JOKER;
    }
}
