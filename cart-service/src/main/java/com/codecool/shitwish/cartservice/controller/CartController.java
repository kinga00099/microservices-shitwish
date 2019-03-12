package com.codecool.shitwish.cartservice.controller;

import com.codecool.shitwish.cartservice.model.Cart;
import com.codecool.shitwish.cartservice.model.CartItem;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping(value={"/api", "/"})
public class CartController {
    private HttpSession session;

    public CartController(HttpSession session) {
        this.session = session;
    }

    public Cart getCart() {
        Cart cart;
        if (session.getAttribute("cart") == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        cart = (Cart) session.getAttribute("cart");
        return cart;
    }

    @GetMapping(value="/cart")
    public Cart reviewCart() {
        return getCart();
    }

    @PostMapping("/cart/add")
    public String addToCart(@RequestBody CartItem cartItem) throws IOException {
        getCart().addToCart(cartItem);
        return "Success.";
    }

    @PostMapping("/cart/sub")
    public String subtractFromCart(@RequestBody CartItem cartItem) throws IOException {
        getCart().subtractFromCart(cartItem);
        return "Success.";
    }

    @PostMapping(value="/cart/delete")
    public String deleteFromCart(@RequestBody CartItem cartItem) throws IOException {
        getCart().removeFromCart(cartItem);
        return "Success.";
    }
}
