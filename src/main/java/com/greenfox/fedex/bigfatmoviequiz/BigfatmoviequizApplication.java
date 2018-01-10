package com.greenfox.fedex.bigfatmoviequiz;

import com.greenfox.fedex.bigfatmoviequiz.model.Movie;
import com.greenfox.fedex.bigfatmoviequiz.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BigfatmoviequizApplication implements CommandLineRunner {

	@Autowired
	MovieRepo movieRepo;

	public static void main(String[] args) {
		SpringApplication.run(BigfatmoviequizApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		movieRepo.save(new Movie("A powerful, and savvy politician wants to bring peace and justice to his subjects, replacing decades of corrupt mysticism and buracracy. The journey is difficult; however after a lot of hard work, rising through the ranks, surviving a brutal assassination attempt and taking an orphan under his wing he establishes one of the most impressive empires ever seen and becomes the Senate.", "Star Wars", "Dune", "1984", "tt0076759", ""));
	}
}


//	this.description = description;
//	this.correctTitle = correctTitle;
//	this.wrongTitleOne = wrongTitleOne;
//	this.wrongTitleTwo = wrongTitleTwo;
//	this.imdbID = imdbID;
//	this.imageURL = imageURL;