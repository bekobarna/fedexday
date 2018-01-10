package com.greenfox.fedex.bigfatmoviequiz.repository;

import com.greenfox.fedex.bigfatmoviequiz.model.Quiz;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepo extends JpaRepository<Quiz, Long> {
    Quiz findById(Long id);
}
