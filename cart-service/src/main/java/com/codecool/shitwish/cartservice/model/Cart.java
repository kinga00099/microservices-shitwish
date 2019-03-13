package com.codecool.shitwish.cartservice.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {
    private List<CartItem> cartItems = new ArrayList<>();
    private Integer itemCount;
    private Integer sumPrice;

    public void addToCart(CartItem cartItem) {
        if (this.cartItems.contains(cartItem)) {
            cartItems.get(cartItems.indexOf(cartItem)).countIncrease();
        } else {
            cartItems.add(cartItem);
        }
        calculateItemCount();
        calculateSumPrice();
    }

    public void subtractFromCart(CartItem cartItem) {
        if (this.cartItems.contains(cartItem) && cartItems.get(cartItems.indexOf(cartItem)).getCount() > 1) {
            cartItems.get(cartItems.indexOf(cartItem)).countDecrease();
        } else if (this.cartItems.contains(cartItem) && cartItems.get(cartItems.indexOf(cartItem)).getCount() == 1) {
            cartItems.remove(cartItem);
        }
        calculateItemCount();
        calculateSumPrice();
    }

    public void removeFromCart(CartItem cartItem) {
        this.cartItems.remove(cartItem);
        calculateItemCount();
        calculateSumPrice();
    }

    private void calculateSumPrice() {
        Integer tempPrice = 0;
        for (CartItem item : cartItems) {
            tempPrice = tempPrice + item.getSumPrice();
        }
        this.sumPrice = tempPrice;
    }

    private void calculateItemCount() {
        Integer tempCount = 0;
        for (CartItem item : cartItems) {
            tempCount = tempCount + item.getCount();
        }
        this.itemCount = tempCount;
    }

    public CartItem findById(Integer presentId) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getId().equals(presentId)) {
                return cartItem;
            }
        }
        return  null;
    }
}

