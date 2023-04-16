package com.bojaruniec.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public Item getItemByName(String name) {
        return itemRepository.findByName(name);
    }

    public List<Item> getItemsByName(List<String> itemsNames) {

        System.out.println("pies");

        List<Item> items = new ArrayList<>();
        Item item;

        for (String name : itemsNames) {
            item = itemRepository.findByName(name);
            items.add(item);
        }

        return items;
    }

    public Item save(ItemRequest itemRequest) {
        Item item = Item.builder()
                .name(itemRequest.getName())
                .category(itemRequest.getCategory())
                .price(itemRequest.getPrice())
                .build();

        return itemRepository.save(item);
    }
}
