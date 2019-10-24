package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MailSender {

    @Autowired
    private MailDao mailDao;

    private Map<MailType, MailGenerator> map = new HashMap<>();

    public void register(MailType mailType, MailGenerator mailGenerator) {
        map.put(mailType, mailGenerator);
    }

    @Scheduled(fixedDelay = 1000)
    public void send() {
        MailType mailType = mailDao.getMailType();
        MailGenerator mailGenerator = map.get(mailType);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailType + " not supported!");
        }
        String html = mailGenerator.generate();
        sendEmail(html);
    }

    private void sendEmail(String html) {
        System.out.println("was sent = " + html);
    }
}
