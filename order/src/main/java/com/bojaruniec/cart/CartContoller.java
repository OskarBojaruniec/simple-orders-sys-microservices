package com.bojaruniec.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/carts")
@RequiredArgsConstructor
public class CartContoller {

    private final CartRepository cartRepository;

    @GetMapping
    public List<Cart> getCarts() {
        return cartRepository.findAll();
    }
}
