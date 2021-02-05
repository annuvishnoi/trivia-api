package com.galvanize.trivia.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class TriviaControllerITTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void test_getAllTriviaQuestions_return200_withQuestions() throws Exception {

        mockMvc.perform(get("/api/v1/trivia"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$").exists())
                .andExpect(jsonPath("$[0].quizId").value(1))
        		.andExpect(jsonPath("$[0].questionNumber").value(1))
		        .andExpect(jsonPath("$[0].question").value("What did Yankee Doodle stick in his cap?"))
		        .andExpect(jsonPath("$[0].createdAt").value("2018-02-02 20:04:25"))
		        .andExpect(jsonPath("$[0].answers").isArray())
		        .andExpect(jsonPath("$[0].answers[0].text").value("Feather"))
		        .andDo(print());
        		

    }
}
