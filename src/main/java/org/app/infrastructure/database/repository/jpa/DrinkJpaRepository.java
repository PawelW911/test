package org.app.infrastructure.database.repository.jpa;

import org.app.infrastructure.database.entity.DrinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkJpaRepository extends JpaRepository<DrinkEntity, Integer> {


}
