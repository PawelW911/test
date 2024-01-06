package org.app.util;

import lombok.experimental.UtilityClass;
import org.app.domain.StreetDelivery;
import org.app.infrastructure.database.entity.StreetDeliveryEntity;

import java.util.HashSet;
import java.util.Set;

@UtilityClass
public class StreetDeliveryFixtures {


    public static Set<StreetDelivery> someStreetDelivery1() {
        Set<StreetDelivery> streetsDelivery = new HashSet<>();
        streetsDelivery.add(StreetDelivery.builder()
                        .street("Poczdamska")
                        .city("Warszawa")
                .build());
        streetsDelivery.add(StreetDelivery.builder()
                        .street("Ulanska")
                        .city("Warszawa")
                .build());
        streetsDelivery.add(StreetDelivery.builder()
                        .street("Kwiatowa")
                        .city("Warszawa")
                .build());
        streetsDelivery.add(StreetDelivery.builder()
                        .street("Wielka")
                        .city("Warszawa")
                .build());
        streetsDelivery.add(StreetDelivery.builder()
                        .street("Morska")
                        .city("Warszawa")
                .build());

        return streetsDelivery;

    }
}
