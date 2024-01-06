package org.app.infrastructure.database.repository.jpa;

import org.app.infrastructure.database.entity.OpinionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpinionJpaRepository extends JpaRepository<OpinionEntity, Integer> {


}
