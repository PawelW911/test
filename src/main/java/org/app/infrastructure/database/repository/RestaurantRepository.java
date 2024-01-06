package org.app.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.app.business.dao.RestaurantDAO;
import org.app.domain.Restaurant;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class RestaurantRepository implements RestaurantDAO {

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        return null;
    }
}
