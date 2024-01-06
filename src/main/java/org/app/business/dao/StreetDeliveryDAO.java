package org.app.business.dao;

import org.app.domain.StreetDelivery;

import java.util.Set;

public interface StreetDeliveryDAO {
    Set<StreetDelivery> saveStreetDeliveries(Set<StreetDelivery> streetDeliveries);
}
