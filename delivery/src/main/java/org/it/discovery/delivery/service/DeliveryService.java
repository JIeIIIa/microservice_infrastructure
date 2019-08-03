package org.it.discovery.delivery.service;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.it.discovery.delivery.domain.Item;
import org.it.discovery.delivery.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

@Service
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
