package com.reservation.demo.dto;

import java.util.Objects;

public class Item {
    private String code;
    private Double price;

    public Item(String code, Double price) {
        this.code = code;
        this.price = price;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(code, item.code) && Objects.equals(price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, price);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
