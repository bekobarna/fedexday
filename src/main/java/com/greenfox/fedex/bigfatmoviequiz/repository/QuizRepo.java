package com.greenfox.fedex.bigfatmoviequiz.repository;

import com.greenfox.fedex.bigfatmoviequiz.model.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepo extends CrudRepository<Quiz, Long> {
    Quiz findById(Long id);
}
