package com.galvanize.trivia.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class TriviaControllerITTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void test_getAllTriviaQuestions_emptyList() throws Exception {

        mockMvc.perform(get("/api/v1/trivia"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isEmpty());

    }
}
