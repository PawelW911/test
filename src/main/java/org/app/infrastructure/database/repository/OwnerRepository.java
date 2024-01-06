package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.business.dao.OwnerDAO;
import org.app.domain.Owner;
import org.app.infrastructure.database.entity.OwnerEntity;
import org.app.infrastructure.database.repository.jpa.OwnerJpaRepository;
import org.app.infrastructure.database.repository.mapper.OwnerEntityMapper;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class OwnerRepository implements OwnerDAO {

    private final OwnerJpaRepository ownerJpaRepository;
    private final OwnerEntityMapper ownerEntityMapper;

    @Override
    public Owner saveOwner(Owner owner) {
        OwnerEntity toSave = ownerEntityMapper.mapToEntity(owner);
        OwnerEntity saved = ownerJpaRepository.saveAndFlush(toSave);
        return ownerEntityMapper.mapFromEntity(saved);
    }
}
