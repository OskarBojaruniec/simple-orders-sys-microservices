package com.bojaruniec.order;

import com.bojaruniec.cart.Cart;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Orders {

    @Id
    @SequenceGenerator(
            name = "orders_id_sequence",
            sequenceName = "orders_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orders_id_sequence"
    )
    private long id;
    private long customerId;
    private LocalDateTime orderedAt;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Cart cart;
}
