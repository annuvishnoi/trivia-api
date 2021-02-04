package com.galvanize.trivia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.galvanize.trivia.controller.entity.Question;
import com.galvanize.trivia.repository.TriviaQuestionRepository;

@Service
public class TriviaService {
	
	private TriviaQuestionRepository triviaRepository;
	
	public TriviaService(TriviaQuestionRepository triviaRepository) {
		this.triviaRepository = triviaRepository;
	}
	
	public List<Question> getAllTrivia() {
		return triviaRepository.findAll();
	}

}
