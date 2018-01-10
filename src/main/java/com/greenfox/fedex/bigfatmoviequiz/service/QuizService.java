package com.greenfox.fedex.bigfatmoviequiz.service;


import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    public long getRandomNumber() {
        return ThreadLocalRandom.current().nextLong(1,20);
    }
}
