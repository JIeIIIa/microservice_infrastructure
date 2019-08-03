package org.it.discovery.order.service;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.it.discovery.order.domain.Item;
import org.it.discovery.order.repository.DeliveryRepository;

@AllArgsConstructor
public class DeliveryService {

  private final DeliveryRepository deliveryRepository;

  public void deliver(int orderId, double deliveryPrice) {
    Item item = Item.builder()
        .deliveryDate(LocalDateTime.now())
        .orderId(orderId)
        .deliveryPrice(deliveryPrice)
        .build();

    deliveryRepository.save(item);

    System.out.println("Order delivered!");

  }
}
