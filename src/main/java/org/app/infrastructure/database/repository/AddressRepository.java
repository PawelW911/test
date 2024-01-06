package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.business.dao.AddressDAO;
import org.app.domain.Address;
import org.app.infrastructure.database.entity.AddressEntity;
import org.app.infrastructure.database.repository.jpa.AddressJpaRepository;
import org.app.infrastructure.database.repository.mapper.AddressMapper;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AddressRepository implements AddressDAO {

    private final AddressJpaRepository addressJpaRepository;
    private final AddressMapper addressMapper;

    @Override
    public Address saveAddress(Address address) {
        AddressEntity toSave = addressMapper.mapToEntity(address);
        AddressEntity saved = addressJpaRepository.saveAndFlush(toSave);
        return addressMapper.mapFromEntity(saved);
    }
}
