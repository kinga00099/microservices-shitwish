package com.codecool.shitwish.cartservice.model;

import lombok.Data;

@Data
public class CartItem {
    private String title;
    private Integer id;
    private Integer count;
    private Integer basePrice;
    private Integer sumPrice;

    private void calculateSumPrice() {
        this.sumPrice = count * basePrice;
    }

    public CartItem(String title, Integer id, Integer basePrice) {
        this.title = title;
        this.id = id;
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
