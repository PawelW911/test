package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.domain.MainMeal;
import org.app.infrastructure.configuration.PersistenceContainerTestConfiguration;
import org.app.infrastructure.database.entity.MainMealEntity;
import org.app.infrastructure.database.repository.jpa.MainMealJpaRepository;
import org.app.util.MainMealFixtures;
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
public class MainMealRepositoryTest {

    private final MainMealRepository mainMealRepository;
    private final MainMealJpaRepository mainMealJpaRepository;

    @Test
    void correctlySaveMainMeal() {
        // given
        MainMeal mainMeal = MainMealFixtures.someMainMealForPolishFood().stream().toList().get(0).withQuantity(0);

        // when
        List<MainMealEntity> allMainMealBeforeSave = mainMealJpaRepository.findAll();
        mainMealRepository.saveMainMeal(mainMeal);
        List<MainMealEntity> allMainMealAfterSave = mainMealJpaRepository.findAll();

        // then
        Assertions.assertThat(allMainMealBeforeSave).hasSize(allMainMealAfterSave.size() - 1);
    }
}
