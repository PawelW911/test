package org.app.util;

import lombok.experimental.UtilityClass;
import org.app.domain.Appetizer;
import org.app.infrastructure.database.entity.AppetizerEntity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@UtilityClass
public class AppetizerFixtures {

    public static Set<Appetizer> someAppetizersForPolishFood() {
        Set<Appetizer> appetizers = new HashSet<>();
        appetizers.add(Appetizer.builder()
                .name("Tatar")
                .composition("Raw beef, onion")
                .price(new BigDecimal("20.00"))
                .build());
        appetizers.add(Appetizer.builder()
                .name("Herring in cream")
                .composition("Herring, cream, onion")
                .price(new BigDecimal("12.00"))
                .build());

        return appetizers;
    }


}
