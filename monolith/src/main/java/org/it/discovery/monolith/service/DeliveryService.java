package org.it.discovery.monolith.service;

import lombok.AllArgsConstructor;
import org.it.discovery.monolith.domain.Order;
import org.it.discovery.monolith.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeliveryService {
    private final OrderRepository orderRepository;

    public void deliver(Order order) {
        order.setDelivered(true);

        orderRepository.save(order);
        System.out.println("Order delivered!");
    }

}
