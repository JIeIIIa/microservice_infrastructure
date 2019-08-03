package org.it.discovery.delivery.repository;


import org.it.discovery.delivery.domain.Order;

public interface OrderRepository {

    void save(Order order);


    Order findById(int orderId);
}
