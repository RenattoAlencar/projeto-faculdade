package com.faculdade.devops.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void searchEndpointReturnsIsOkay() throws Exception {
        mockMvc.perform(get("/api/v1/search"))
                .andExpect(status().isOk())
                .andExpect(content().string("Is Okay!"));
    }

    @Test
    void searchEndpointWithInvalidUrlReturnsNotFound() throws Exception {
        mockMvc.perform(get("/api/v1/failure"))
                .andExpect(status().isNotFound());
    }
}