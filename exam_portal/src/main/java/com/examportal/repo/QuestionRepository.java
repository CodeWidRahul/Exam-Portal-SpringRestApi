package com.examportal.repo;

import com.examportal.model.exam.Question;
import com.examportal.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    public Set<Question> findByQuiz(Quiz quiz);
}
