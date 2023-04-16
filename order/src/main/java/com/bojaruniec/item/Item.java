package com.bojaruniec.item;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Item {

    @Id

    @GeneratedValue(
            strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Category category;
    private double price;
}
