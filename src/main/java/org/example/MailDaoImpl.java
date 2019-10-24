package org.example;

import org.springframework.stereotype.Repository;

import java.util.Random;

import static org.example.MailType.*;

@Repository
public class MailDaoImpl implements MailDao {
    private Random random = new Random();

    @Override
    public MailType getMailType() {
        int randomType = random.nextInt(3) + 1;
        return switch (randomType) {
            case 1 -> CALLBACK;
            case 2 -> JOKER;
            case 3 -> WELCOME;
            default -> throw new IllegalStateException("Passed mail type not supported");
        };
    }
}
