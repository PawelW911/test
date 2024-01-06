package org.app.infrastructure.database.repository.mapper;

import org.app.domain.Desert;
import org.app.infrastructure.database.entity.DesertEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DesertMapper {
    DesertEntity mapToEntity(Desert desert);

    Desert mapFromEntity(DesertEntity desertEntity);
}
