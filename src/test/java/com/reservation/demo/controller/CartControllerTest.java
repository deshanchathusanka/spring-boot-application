package com.reservation.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest(CartController.class)
class CartControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void readCart() throws Exception {
        RequestBuilder builder = MockMvcRequestBuilders.get("/v2/read/123?sessionId=456");
        mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}