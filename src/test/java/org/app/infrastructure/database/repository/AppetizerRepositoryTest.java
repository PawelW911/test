package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.domain.Appetizer;
import org.app.infrastructure.configuration.PersistenceContainerTestConfiguration;
import org.app.infrastructure.database.entity.AppetizerEntity;
import org.app.infrastructure.database.repository.jpa.AppetizerJpaRepository;
import org.app.util.AppetizerFixtures;
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
public class AppetizerRepositoryTest {

    private final AppetizerRepository appetizerRepository;
    private final AppetizerJpaRepository appetizerJpaRepository;

    @Test
    void correctlyAppetizerSave() {
        // given
        Appetizer appetizer = AppetizerFixtures.someAppetizersForPolishFood().stream().toList().get(0).withQuantity(0);

        // when
        List<AppetizerEntity> allAppetizersBeforeSave = appetizerJpaRepository.findAll();
        appetizerRepository.saveAppetizer(appetizer);
        List<AppetizerEntity> allAppetizerAfterSave = appetizerJpaRepository.findAll();

        // then
        Assertions.assertThat(allAppetizersBeforeSave).hasSize(allAppetizerAfterSave.size() - 1);
    }
}
