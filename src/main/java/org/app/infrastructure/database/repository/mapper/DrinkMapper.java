package org.app.infrastructure.database.repository.mapper;

import org.app.domain.Drink;
import org.app.infrastructure.database.entity.DrinkEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DrinkMapper {
    DrinkEntity mapToEntity(Drink drink);

    Drink mapFromEntity(DrinkEntity drinkEntity);
}
