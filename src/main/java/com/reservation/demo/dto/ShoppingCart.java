package com.reservation.demo.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {

    private User user;
    private final List<Item> items;

    public ShoppingCart(List<Item> items) {
        this.items = items;
    }

    public ShoppingCart() {
        this(new ArrayList<>());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(user, that.user) && Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, items);
    }

    public ShoppingCart addItem(Item item)
    {
        this.items.add(item);
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
