package org.it.discovery.delivery.repository;

import java.util.HashMap;
import java.util.Map;
import org.it.discovery.delivery.domain.Item;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryDeliveryRepository implements DeliveryRepository {

    private final Map<Integer, Item> items = new HashMap<>();

    private int counter;

    @Override
    public void save(Item item) {
        if (item.getId() == 0) {
            item.setId(++counter);
            items.put(item.getId(), item);
        } else {
            items.put(item.getId(), item);
        }
    }

    @Override
    public Item findById(int orderId) {
        return items.get(orderId);
    }

}
