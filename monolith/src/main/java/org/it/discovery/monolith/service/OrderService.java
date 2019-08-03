package org.it.discovery.monolith.service;

import org.it.discovery.monolith.domain.Order;
import org.it.discovery.monolith.domain.OrderItem;
import org.it.discovery.monolith.repository.BookRepository;
import org.it.discovery.monolith.repository.CustomerRepository;
import org.it.discovery.monolith.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    private CustomerRepository customerRepository;

    public void deliver(int orderId) {
        Order order = orderRepository.findById(orderId);
        if (order != null) {
            deliveryService.deliver(order);
        }
    }

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
        order.addItem(new OrderItem(bookRepository.findBookById(bookId), number));
        order.setOrderDate(LocalDateTime.now());
        order.setCustomer(customerRepository.findById(customerId));

        return order;
    }

    public void addBook(int orderId, int bookId, int number) {
        Order order = orderRepository.findById(orderId);
        if (order != null) {
            order.addItem(new OrderItem(bookRepository.findBookById(bookId), number));
            orderRepository.save(order);
        }
    }

}
