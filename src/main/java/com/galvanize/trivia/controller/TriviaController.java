package com.galvanize.trivia.controller;

import java.util.List;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.trivia.controller.entity.Question;
import com.galvanize.trivia.service.TriviaService;

@RestController
@RequestMapping("/api/v1/trivia")
@Api(tags = "Trivia" )
public class TriviaController {
	
	private TriviaService triviaService;
	
	public TriviaController(TriviaService triviaService) {
		this.triviaService = triviaService;
	}

    @GetMapping
    public List<Question> getAllTriviaQuestions() {
        return triviaService.getAllTrivia();

    }
}
