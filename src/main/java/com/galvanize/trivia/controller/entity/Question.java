package com.galvanize.trivia.controller.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "question")
public class Question{
	
	@Id
	private Long id;
	
	private Long quizId;
	
	private Long questionNumber;
	
	private String question;
	
	private String createdAt;
	
	@OneToMany(mappedBy = "question", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Answer> answers;

}
