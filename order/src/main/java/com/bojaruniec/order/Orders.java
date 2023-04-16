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

    @GeneratedValue(
            strategy = GenerationType.IDENTITY)
    private long id;
    private long customerId;
    private LocalDateTime orderedAt;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Cart cart;
}
