package org.app.infrastructure.database.repository.jpa;

import org.app.infrastructure.database.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantJpaRepository extends JpaRepository<RestaurantEntity, Integer> {


    RestaurantEntity findByUniqueCode(String uniqueCode);
}
