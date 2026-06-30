package com.spark.quiz_service.repository;

import com.spark.quiz_service.model.Attempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttemptRepository extends JpaRepository<Attempt, Long> {
}