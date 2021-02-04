package com.galvanize.trivia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galvanize.trivia.controller.entity.Answer;

@Repository
public interface TriviaAnswerRepository extends JpaRepository<Answer, Long>{

}
