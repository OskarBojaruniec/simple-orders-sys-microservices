package com.bojaruniec.customer;

import com.bojaruniec.address.Address;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Address> addresses;


}
