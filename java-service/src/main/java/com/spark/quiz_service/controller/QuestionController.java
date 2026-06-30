package com.spark.quiz_service.controller;

import com.spark.quiz_service.model.Question;
import com.spark.quiz_service.model.Quiz;
import com.spark.quiz_service.repository.QuestionRepository;
import com.spark.quiz_service.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes/{quizId}/questions")
@CrossOrigin(origins = "*")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuizRepository quizRepository;

    @PostMapping
    public Question addQuestion(@PathVariable Long quizId, @RequestBody Question question) {
        Quiz quiz = quizRepository.findById(quizId).orElse(null);
        question.setQuiz(quiz);
        return questionRepository.save(question);
    }

    @GetMapping
    public List<Question> getQuestionsByQuiz(@PathVariable Long quizId) {
        return questionRepository.findAll().stream()
                .filter(q -> q.getQuiz() != null && q.getQuiz().getId().equals(quizId))
                .toList();
    }
}