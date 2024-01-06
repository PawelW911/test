package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.domain.Desert;
import org.app.infrastructure.configuration.PersistenceContainerTestConfiguration;
import org.app.infrastructure.database.entity.DesertEntity;
import org.app.infrastructure.database.repository.jpa.DesertJpaRepository;
import org.app.infrastructure.database.repository.jpa.DrinkJpaRepository;
import org.app.util.DesertFixtures;
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
public class DesertRepositoryTest {

    DesertRepository desertRepository;
    DesertJpaRepository desertJpaRepository;

    @Test
    void correctlySaveDesert() {
        // given
        Desert desert = DesertFixtures.someDesertsForPolishFood().stream().toList().get(0).withQuantity(0);

        // when
        List<DesertEntity> allDesertBeforeSave = desertJpaRepository.findAll();
        desertRepository.saveDesert(desert);
        List<DesertEntity> allDesertAfterSave = desertJpaRepository.findAll();

        // then
        Assertions.assertThat(allDesertBeforeSave).hasSize(allDesertAfterSave.size() - 1);

    }
}
