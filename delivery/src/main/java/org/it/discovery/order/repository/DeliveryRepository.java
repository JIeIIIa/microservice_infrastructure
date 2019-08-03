package org.it.discovery.order.repository;

import org.it.discovery.order.domain.Item;

public interface DeliveryRepository {

    void save(Item item);

    Item findById(int itemId);
}
