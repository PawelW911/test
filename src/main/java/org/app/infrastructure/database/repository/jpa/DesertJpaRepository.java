package org.app.infrastructure.database.repository.jpa;

import org.app.infrastructure.database.entity.DesertEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesertJpaRepository extends JpaRepository<DesertEntity, Integer> {


}
