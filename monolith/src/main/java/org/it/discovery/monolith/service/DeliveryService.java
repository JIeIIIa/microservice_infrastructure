package org.it.discovery.monolith.service;

import org.it.discovery.monolith.domain.Order;
import org.it.discovery.monolith.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    @Autowired
    private OrderRepository orderRepository;

    public void deliver(Order order) {
        order.setDelivered(true);

        orderRepository.save(order);
        System.out.println("Order delivered!");
    }

}
