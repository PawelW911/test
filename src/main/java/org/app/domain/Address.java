package org.app.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "addressId")
@ToString(of = {"addressId", "street", "localNumber", "postalCode", "city"})
public class Address {

    Integer addressId;
    String street;
    String localNumber;
    String postalCode;
    String city;
}
