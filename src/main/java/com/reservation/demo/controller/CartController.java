package com.reservation.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Cart Controller Class
 * @author deshan
 */
@RestController
public class CartController {

    /**
     * Read cart endpoint method
     * @param cartId
     * @return shopping basket
     */
    @GetMapping(path = "/read/{cartId}")
    public String readCart(@PathVariable Integer cartId) {
        return "Your cart is empty.";
    }
}
