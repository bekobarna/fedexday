package com.greenfox.fedex.bigfatmoviequiz;

import com.greenfox.fedex.bigfatmoviequiz.model.Movie;
import com.greenfox.fedex.bigfatmoviequiz.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BigfatmoviequizApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BigfatmoviequizApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
