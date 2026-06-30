package com.spark.quiz_service.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "attempts")
@Data
public class Attempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long quizId;

    private Integer score;

    private Integer totalQuestions;

    private LocalDateTime submittedAt;

    private Long timeTakenSeconds;
}