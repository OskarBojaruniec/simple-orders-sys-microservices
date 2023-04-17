package com.bojaruniec.cart;

import com.bojaruniec.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;
    private final ItemService itemService;

    public Cart getCart(CartRequest cartRequest) {

        return Cart.builder()
                .itemsList(itemService.getItemsByName(cartRequest.getItemsNames()))
                .build();
    }


}
