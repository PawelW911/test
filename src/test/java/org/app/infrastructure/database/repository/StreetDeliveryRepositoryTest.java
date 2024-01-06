package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.domain.StreetDelivery;
import org.app.infrastructure.configuration.PersistenceContainerTestConfiguration;
import org.app.infrastructure.database.entity.StreetDeliveryEntity;
import org.app.infrastructure.database.repository.StreetDeliveryRepository;
import org.app.infrastructure.database.repository.jpa.StreetDeliveryJpaRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Set;

import static org.app.util.StreetDeliveryFixtures.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(PersistenceContainerTestConfiguration.class)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StreetDeliveryRepositoryTest {

    private final StreetDeliveryRepository streetDeliveryRepository;
    private final StreetDeliveryJpaRepository streetDeliveryJpaRepository;

    @Test
    void correctlySaveStreetDelivery() {
        // given
        Set<StreetDelivery> streetDeliveries = someStreetDelivery1();

        // when
        streetDeliveryRepository.saveStreetDeliveries(streetDeliveries);
        List<StreetDeliveryEntity> allStreet = streetDeliveryJpaRepository.findAll();

        // then
        Assertions.assertThat(allStreet).hasSize(streetDeliveries.size());

    }
}
