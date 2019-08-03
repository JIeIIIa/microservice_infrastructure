package org.it.discovery.delivery.controller;

import lombok.AllArgsConstructor;
import org.it.discovery.delivery.service.DeliveryService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DeliveryController {

  private final DeliveryService deliveryService;

  public void deliver(int orderId, double price) {
    deliveryService.deliver(orderId, price);
  }

}
