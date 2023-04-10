package com.bojaruniec.customer;

import com.bojaruniec.address.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long id;
    private String name;
    private String surname;
    private List<Address> addresses;
    private String email;
}
