package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.domain.Soup;
import org.app.infrastructure.configuration.PersistenceContainerTestConfiguration;
import org.app.infrastructure.database.entity.SoupEntity;
import org.app.infrastructure.database.repository.jpa.SoupJpaRepository;
import org.app.util.SoupFixtures;
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
public class SoupRepositoryTest {

    private final SoupRepository soupRepository;
    private final SoupJpaRepository soupJpaRepository;

    @Test
    void correctlySaveSoup() {
        // given
        Soup soup = SoupFixtures.someSoupsForPolishFood().stream().toList().get(0).withQuantity(0);

        // when
        List<SoupEntity> allSoupBeforeSave = soupJpaRepository.findAll();
        soupRepository.saveSoup(soup);
        List<SoupEntity> allSoupAfterSave = soupJpaRepository.findAll();

        // then
        Assertions.assertThat(allSoupBeforeSave).hasSize(allSoupAfterSave.size() - 1);
    }
}
