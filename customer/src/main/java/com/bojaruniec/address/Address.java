package com.bojaruniec.address;

import com.bojaruniec.customer.Customer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue (
            strategy = GenerationType.IDENTITY
    )
    private long id;
    private List<Customer> customers;
    private String street;
    private String streetNumber;
    private String zipCode;
}
