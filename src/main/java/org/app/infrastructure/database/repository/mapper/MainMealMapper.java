package org.app.infrastructure.database.repository.mapper;

import org.app.domain.MainMeal;
import org.app.infrastructure.database.entity.MainMealEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MainMealMapper {
    MainMealEntity mapToEntity(MainMeal mainMeal);

    MainMeal mapFromEntity(MainMealEntity mainMealEntity);
}
