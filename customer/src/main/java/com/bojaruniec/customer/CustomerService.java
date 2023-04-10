package com.bojaruniec.customer;

import com.bojaruniec.address.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    public List<Customer> getListOfCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomerWithAddress(CustomerRequest customerRequest) {

        List<Address> addresses = new ArrayList<>();
        addresses.add(customerRequest.getAddress());

        Customer customer = Customer.builder()
                .name(customerRequest.getName())
                .surname(customerRequest.getSurname())
                .phoneNumber(customerRequest.getPhoneNumber())
                .email(customerRequest.getEmail())
                .addresses(addresses)
                .build();

        customerRepository.save(customer);
    }
}
