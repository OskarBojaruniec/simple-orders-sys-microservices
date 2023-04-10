package com.bojaruniec.address;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue (
            strategy = GenerationType.IDENTITY
    )
    private long id;
    private String street;
    private String streetNumber;
    private String city;
}
