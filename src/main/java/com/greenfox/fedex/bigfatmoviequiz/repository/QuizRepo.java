package com.greenfox.fedex.bigfatmoviequiz.repository;

import com.greenfox.fedex.bigfatmoviequiz.model.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface QuizRepo extends CrudRepository<Quiz, Long> {
    Quiz findById(@Param("id") Long id);
}
