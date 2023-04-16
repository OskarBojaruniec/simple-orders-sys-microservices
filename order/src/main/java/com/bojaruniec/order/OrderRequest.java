package com.bojaruniec.order;

import com.bojaruniec.cart.Cart;
import com.bojaruniec.cart.CartRequest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderRequest {

    private CartRequest cartRequest;
    private long customerId;

}
