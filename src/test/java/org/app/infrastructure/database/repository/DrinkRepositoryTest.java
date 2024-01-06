package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.domain.Drink;
import org.app.infrastructure.configuration.PersistenceContainerTestConfiguration;
import org.app.infrastructure.database.entity.DrinkEntity;
import org.app.infrastructure.database.repository.jpa.DrinkJpaRepository;
import org.app.util.DrinkFixtures;
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
public class DrinkRepositoryTest {

    private final DrinkRepository drinkRepository;
    private final DrinkJpaRepository drinkJpaRepository;

    @Test
    void correctlySaveDrink() {
        // given
        Drink drink = DrinkFixtures.someDrinksForPolishFood().stream().toList().get(0).withQuantity(0);

        // when
        List<DrinkEntity> allDrinkBeforeSave = drinkJpaRepository.findAll();
        drinkRepository.saveDrink(drink);
        List<DrinkEntity> allDrinkAfterSave = drinkJpaRepository.findAll();

        // then
        Assertions.assertThat(allDrinkBeforeSave).hasSize(allDrinkAfterSave.size() - 1);
    }
}
