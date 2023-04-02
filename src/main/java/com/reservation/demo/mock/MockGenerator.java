package com.reservation.demo.mock;

import com.reservation.demo.dto.Item;
import com.reservation.demo.dto.ShoppingCart;
import com.reservation.demo.dto.User;

public class MockGenerator {
    public static ShoppingCart getDummyCart() {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("CAR", 200.0);
        cart.addItem(item);

        User user = new User("Deshan");
        cart.setUser(user);
        return cart;
    }
}
