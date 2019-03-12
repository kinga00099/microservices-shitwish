package com.codecool.shitwish.cartservice.model;

import lombok.Data;

@Data
public class CartItem {
    private String name;
    private Integer presentId;
    private Integer count;
    private Integer basePrice;
    private Integer sumPrice;

    private void calculateSumPrice() {
        this.sumPrice = count * basePrice;
    }

    public CartItem(String name, Integer presentId, Integer basePrice, Integer sumPrice) {
        this.name = name;
        this.presentId = presentId;
        this.count = 1;
        this.basePrice = basePrice;
        this.sumPrice = basePrice;
    }

    public void countIncrease() {
        this.count++;
        this.calculateSumPrice();
    }

    public void countDecrease() {
        this.count--;
        this.calculateSumPrice();
    }
}
