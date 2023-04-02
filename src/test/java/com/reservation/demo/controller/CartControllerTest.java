package com.reservation.demo.controller;


import com.reservation.demo.dto.Item;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CartController.class)
class CartControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void readCart() throws Exception {
        RequestBuilder builder = get("/read/123?sessionId=456");
        ResultActions resultActions = mockMvc.perform(builder);

        resultActions.andExpect(status().isOk());
        resultActions.andExpect(content().contentType("application/json"));
        resultActions.andExpect(jsonPath("$.items", Matchers.hasSize(1)));
        resultActions.andExpect(jsonPath("$.items[0].code", Matchers.equalTo("CAR")));
    }
}