package com.bojaruniec.cart;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Data
@Getter
@Setter
public class CartRequest {

    private List<String> itemsNames;
}
