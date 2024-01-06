package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.domain.Owner;
import org.app.infrastructure.configuration.PersistenceContainerTestConfiguration;
import org.app.infrastructure.database.entity.OwnerEntity;
import org.app.infrastructure.database.repository.OwnerRepository;
import org.app.infrastructure.database.repository.jpa.OwnerJpaRepository;
import org.app.util.OwnerFixtures;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(PersistenceContainerTestConfiguration.class)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class OwnerRepositoryTest {

    private final OwnerJpaRepository ownerJpaRepository;
    private final OwnerRepository ownerRepository;

    @Test
    void correctlySaveOwner() {
        // given
        Owner owner = OwnerFixtures.someOwner1();

        // when
        ownerRepository.saveOwner(owner);
        OwnerEntity ownerEntity = ownerJpaRepository.findByEmail(owner.getEmail());

        // then
        Assertions.assertThatObject(ownerEntity).isNotNull();
    }

}
