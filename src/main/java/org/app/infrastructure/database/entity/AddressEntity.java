package org.app.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "addressId")
@ToString(of = {"addressId", "street", "localNumber", "postalCode", "city"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "street")
    private String street;

    @Column(name = "local_number")
    private String localNumber;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "city")
    private String city;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "address")
    private CustomerEntity customer;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "address")
    private RestaurantEntity restaurant;
}
