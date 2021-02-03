package com.galvanize.trivia.controller;

import com.galvanize.trivia.controller.entity.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/trivia")
public class TriviaController {

    @GetMapping
    public List<Question> getAllTriviaQuestions() {
        return new ArrayList<>();

    }
}
