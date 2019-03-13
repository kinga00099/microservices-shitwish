package com.codecool.shitwish.cartservice.controller;

import com.codecool.shitwish.cartservice.model.Cart;
import com.codecool.shitwish.presentservice.model.Present;
import com.codecool.shitwish.cartservice.model.CartItem;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping(value={"/api", "/"})
@SessionAttributes("cart")
public class CartController {
    private HttpSession session;
    private Cart cart;

    public CartController(HttpSession session) {
        this.session = session;
        this.cart = new Cart();
    }

    public Cart getCart() {
        System.out.println(session.getAttribute("cart"));
        if (session.getAttribute("cart") == null) {
            //cart = new Cart();
            session.setAttribute("cart", cart);
        }
        System.out.println(session.getAttribute("cart"));
        cart = (Cart) session.getAttribute("cart");
        return cart;
    }

    public CartItem convertPresent(Present present) {
        return new CartItem(present.getTitle(), present.getId(), present.getImage(), present.getPrice());
    }

    @GetMapping(value="/cart")
    public Cart reviewCart() {
        return getCart();
    }

    @GetMapping(value="/cart/size")
    public Integer getCartSize() {
        return getCart().getItemCount();
    }

    @PostMapping("/cart")
    public String addToCart(@RequestBody Present present) throws IOException {
        cart.addToCart(convertPresent(present));
        System.out.println("cart:"+cart);
        return "Success.";
    }

    @PutMapping("/cart/{id}")
    public String subtractFromCart(@PathVariable Integer id) throws IOException {
        getCart().subtractFromCart(getCart().findById(id));
        return "Success.";
    }

    @DeleteMapping(value="/cart/{id}")
    public String deleteFromCart(@PathVariable Integer id) throws IOException {
        getCart().removeFromCart(getCart().findById(id));
        return "Success.";
    }
}
