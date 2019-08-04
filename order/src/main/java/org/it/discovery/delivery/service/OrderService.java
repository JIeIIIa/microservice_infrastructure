package org.it.discovery.delivery.service;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import org.it.discovery.delivery.domain.Order;
import org.it.discovery.delivery.domain.OrderItem;
import org.it.discovery.delivery.repository.CustomerRepository;
import org.it.discovery.delivery.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class OrderService {

  private final RestTemplate restTemplate;

  private final OrderRepository orderRepository;

  private final CustomerRepository customerRepository;

  public void complete(int orderId) {
    Order order = orderRepository.findById(orderId);
    if (order != null) {
      order.setPayed(true);
      orderRepository.save(order);
    }
  }

  public void cancel(int orderId) {
    Order order = orderRepository.findById(orderId);
    if (order != null) {
      order.setCancelled(true);
      orderRepository.save(order);
    }
  }

  public Order createOrder(int bookId, int number, int customerId) {
    Order order = new Order();
    order.addItem(new OrderItem(bookId, number, fetchPrice(bookId)));
    order.setOrderDate(LocalDateTime.now());
    order.setCustomer(customerRepository.findById(customerId));
    orderRepository.save(order);

    return order;
  }

  private Double fetchPrice(int bookId) {
    System.out.println("fetching price...");
    return restTemplate.getForObject("http://library-client/api/v2/book/{id}/price", Double.class, bookId);
  }

  public void addBook(int orderId, int bookId, int number) {
    Order order = orderRepository.findById(orderId);
    if (order != null) {
      order.addItem(new OrderItem(bookId, number, fetchPrice(bookId)));
      orderRepository.save(order);
    }
  }

  public void delivery(int orderId) {
    Order order = orderRepository.findById(orderId);
    if (order != null) {
      order.setDelivered(true);
      orderRepository.save(order);
    }
  }

  public List<Order> findAll() {
    return orderRepository.findAll();
  }
}
