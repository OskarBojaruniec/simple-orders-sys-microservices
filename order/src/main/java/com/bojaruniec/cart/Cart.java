package com.bojaruniec.cart;

import com.bojaruniec.item.Item;
import lombok.*;



import javax.persistence.*;
import java.util.List;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany
    private List<Item> items;
}
