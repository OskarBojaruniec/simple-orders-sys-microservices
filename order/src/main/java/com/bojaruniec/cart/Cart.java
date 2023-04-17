package com.bojaruniec.cart;

import com.bojaruniec.item.Item;
import lombok.*;
import org.hibernate.annotations.Cascade;


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
    @SequenceGenerator(
            name = "cart_id_sequence",
            sequenceName = "cart_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cart_id_sequence"
    )
    private long id;
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Item> itemsList;
}
