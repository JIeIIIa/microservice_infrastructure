package org.it.discovery.delivery.repository;


import java.util.List;
import org.it.discovery.delivery.domain.Order;

public interface OrderRepository {

    void save(Order order);


    Order findById(int orderId);

    List<Order> findAll();
}
