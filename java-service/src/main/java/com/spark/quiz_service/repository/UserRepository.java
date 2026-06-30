package com.spark.quiz_service.repository;

import com.spark.quiz_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}