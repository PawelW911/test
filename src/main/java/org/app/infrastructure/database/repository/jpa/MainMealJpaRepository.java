package org.app.infrastructure.database.repository.jpa;

import org.app.infrastructure.database.entity.MainMealEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainMealJpaRepository extends JpaRepository<MainMealEntity, Integer> {


}
