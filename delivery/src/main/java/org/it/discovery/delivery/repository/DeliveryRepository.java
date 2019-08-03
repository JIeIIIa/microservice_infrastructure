package org.it.discovery.delivery.repository;

import org.it.discovery.delivery.domain.Item;

public interface DeliveryRepository {

    void save(Item item);

    Item findById(int itemId);
}
