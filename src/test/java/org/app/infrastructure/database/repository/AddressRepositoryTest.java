package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.domain.Address;
import org.app.infrastructure.configuration.PersistenceContainerTestConfiguration;
import org.app.infrastructure.database.entity.AddressEntity;
import org.app.infrastructure.database.repository.AddressRepository;
import org.app.infrastructure.database.repository.jpa.AddressJpaRepository;
import org.app.util.AddressFixtures;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(PersistenceContainerTestConfiguration.class)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AddressRepositoryTest {

    private final AddressRepository addressRepository;
    private final AddressJpaRepository addressJpaRepository;


    @Test
    void correctlySaveAddress() {
        // given
        Address address = AddressFixtures.someAddress1();

        // when
        List<AddressEntity> addressEntitiesBeforeSave = addressJpaRepository.findAll();
        addressRepository.saveAddress(address);
        List<AddressEntity> addressEntitiesAfterSave = addressJpaRepository.findAll();

        // then
        Assertions.assertThat(addressEntitiesBeforeSave).hasSize(addressEntitiesAfterSave.size() - 1);
    }
}
