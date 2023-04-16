package com.bojaruniec.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<Orders> getOrders() {
        return orderService.getOrders();
    }

    @PostMapping
    public Orders addOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.saveOrder(orderRequest);
    }
}
