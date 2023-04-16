package com.bojaruniec.item;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/items")
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public Item save(@RequestBody ItemRequest itemRequest) {
        return itemService.save(itemRequest);
    }
}
