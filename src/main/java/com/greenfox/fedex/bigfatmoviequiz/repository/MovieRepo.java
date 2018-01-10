package com.greenfox.fedex.bigfatmoviequiz.repository;

import com.greenfox.fedex.bigfatmoviequiz.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends JpaRepository<Movie, String> {
}
