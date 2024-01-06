package org.app.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "menuId")
@ToString(of = {"menuId", "appetizers", "soups", "mainMeals", "deserts", "drinks", "restaurant"})
public class Menu {

    Integer menuId;
    Set<Appetizer> appetizers;
    Set<Soup> soups;
    Set<MainMeal> mainMeals;
    Set<Desert> deserts;
    Set<Drink> drinks;
    Restaurant restaurant;

}
