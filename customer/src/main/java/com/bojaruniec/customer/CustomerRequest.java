package com.bojaruniec.customer;

import com.bojaruniec.address.Address;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CustomerRequest {

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private Address address;

}
