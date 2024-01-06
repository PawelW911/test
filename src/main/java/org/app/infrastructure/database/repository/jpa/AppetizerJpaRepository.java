package org.app.infrastructure.database.repository.jpa;

import org.app.infrastructure.database.entity.AppetizerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppetizerJpaRepository extends JpaRepository<AppetizerEntity, Integer> {


}
