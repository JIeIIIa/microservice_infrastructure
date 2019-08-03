package org.it.discovery.order.repository;


import org.it.discovery.order.domain.Order;

public interface OrderRepository {

    void save(Order order);


    Order findById(int orderId);
}
