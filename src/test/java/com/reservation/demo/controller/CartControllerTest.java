package com.reservation.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CartControllerTest {

    @LocalServerPort
    private String localPort;

    @Autowired
    private TestRestTemplate mockRestTemplate;

    @Test
    void readCart() {
        StringBuilder urlBuilder = new StringBuilder()
                .append("http://localhost:")
                        .append(localPort)
                                .append("/read")
                                        .append("/120");
        assertThat(mockRestTemplate.getForObject(urlBuilder.toString(), String.class))
                .isEqualTo("Your cart is empty.");
    }
}