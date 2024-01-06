package org.app.infrastructure.database.repository.jpa;

import org.app.infrastructure.database.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuJpaRepository extends JpaRepository<MenuEntity, Integer> {


}
