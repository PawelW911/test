package org.app.infrastructure.database.repository.mapper;

import org.app.domain.StreetDelivery;
import org.app.infrastructure.database.entity.StreetDeliveryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StreetDeliveryMapper {
    StreetDeliveryEntity mapToEntity(StreetDelivery streetDelivery);

    StreetDelivery mapFromEntity(StreetDeliveryEntity streetDeliveryEntity);
}
