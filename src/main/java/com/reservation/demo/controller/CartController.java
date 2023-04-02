package com.reservation.demo.controller;

import com.reservation.demo.dto.ShoppingCart;
import com.reservation.demo.mock.MockGenerator;
import org.springframework.web.bind.annotation.*;

/**
 * Cart Controller Class
 *
 * @author deshan
 */
@RestController
public class CartController {

    /**
     * Read cart endpoint method
     *
     * @param cartId
     * @return shopping basket
     */
    @GetMapping(path = "/read/{cartId}")
    public @ResponseBody ShoppingCart readCart(@PathVariable Integer cartId,
                                               @RequestParam String sessionId) {
        return MockGenerator.getDummyCart();
    }
}
