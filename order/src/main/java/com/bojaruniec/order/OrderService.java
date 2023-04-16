package com.bojaruniec.order;

import com.bojaruniec.cart.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;
    private final CartService cartService;
    public Orders saveOrder(OrderRequest orderRequest) {
        System.out.println(orderRequest.getCartRequest().getItemsNames());
        Orders order = Orders.builder()
                .customerId(orderRequest.getCustomerId())
                .cart(cartService.getCart(orderRequest.getCartRequest()))
                .orderedAt(LocalDateTime.now())
                .build();

        return orderRepository.save(order);
    }

    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }
}
