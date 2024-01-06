package org.app.domain;

import lombok.*;

import java.math.BigDecimal;

@With
@Value
@Builder
@EqualsAndHashCode(of = "mainMealId")
@ToString(of = {"mainMealId", "name", "composition", "price", "quantity"})
public class MainMeal {

    Integer mainMealId;
    String name;
    String composition;
    BigDecimal price;
    Integer quantity;
}
