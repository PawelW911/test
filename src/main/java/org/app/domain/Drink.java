package org.app.domain;

import lombok.*;

import java.math.BigDecimal;

@With
@Value
@Builder
@EqualsAndHashCode(of = "drinkId")
@ToString(of = {"drinkId", "name", "composition", "price", "quantity", "alcoholFree"})
public class Drink {

    Integer drinkId;
    String name;
    String composition;
    BigDecimal price;
    Integer quantity;
    Boolean alcoholFree;
}
