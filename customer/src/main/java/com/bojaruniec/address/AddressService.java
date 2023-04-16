package com.bojaruniec.address;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;

    public Address save(Address address) {
        return addressRepository.save(address);
    }
}
