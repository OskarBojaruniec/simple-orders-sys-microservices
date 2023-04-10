package com.bojaruniec.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getListOfCustomers() {
        return customerService.getListOfCustomers();
    }

    @PostMapping
    public void addCustomerWithAddress(@RequestBody CustomerRequest customerRequest) {
        customerService.addCustomerWithAddress(customerRequest);
    }
}
