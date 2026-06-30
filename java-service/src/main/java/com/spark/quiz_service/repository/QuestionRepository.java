package com.spark.quiz_service.repository;

import com.spark.quiz_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}