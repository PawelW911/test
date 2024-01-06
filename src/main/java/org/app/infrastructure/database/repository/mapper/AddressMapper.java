package org.app.infrastructure.database.repository.mapper;

import org.app.domain.Address;
import org.app.infrastructure.database.entity.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {
    AddressEntity mapToEntity(Address address);

    Address mapFromEntity(AddressEntity addressEntity);
}
