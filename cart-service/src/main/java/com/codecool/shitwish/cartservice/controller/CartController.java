package com.codecool.shitwish.cartservice.controller;

import com.codecool.shitwish.cartservice.model.Cart;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

@RestController
@CrossOrigin
@RequestMapping(value={"/api", "/"})
public class CartController {
    private HttpSession session;

    public CartController(HttpSession session) {
        this.session = session;
    }

    @GetMapping(value="/cart")
    public Cart getCart() {
        Cart cart;
        if (session.getAttribute("cart") == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        cart = (Cart) session.getAttribute("cart");
        return cart;
    }

    @PostMapping("/cart/{id}")
    public String addToCartById(@PathVariable("id") Integer id) throws IOException {
        return "Success.";
    }

    @DeleteMapping(value="/cart/{id}")
    public String deleteFromCartById(@PathVariable("id") Integer id) throws IOException {
            return "Success.";
    }
}
