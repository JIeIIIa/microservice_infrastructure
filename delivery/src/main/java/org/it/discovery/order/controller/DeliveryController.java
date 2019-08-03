package org.it.discovery.order.controller;

import lombok.AllArgsConstructor;
import org.it.discovery.order.service.DeliveryService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DeliveryController {

  private final DeliveryService deliveryService;

  public void deliver(int orderId, double price) {
    deliveryService.deliver(orderId, price);
  }

}
