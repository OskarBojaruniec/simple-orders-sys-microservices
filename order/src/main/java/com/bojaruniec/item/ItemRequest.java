package com.bojaruniec.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ItemRequest {

    private String name;
    private Category category;
    private double price;
}
