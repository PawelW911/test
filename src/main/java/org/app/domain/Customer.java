package org.app.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "email")
@ToString(of = {"customerId", "name", "surname", "email", "phone", "address", "opinion", "order"})
public class Customer {

    Integer customerId;
    String name;
    String surname;
    String email;
    String phone;
    Address address;
    Opinion opinion;
    Order order;

}
