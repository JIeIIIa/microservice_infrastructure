package org.it.discovery.delivery.repository;

import java.util.HashMap;
import java.util.Map;
import org.it.discovery.delivery.domain.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    private final Map<Integer, Customer> customers = new HashMap<>();

    public InMemoryCustomerRepository() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Sam Newman");
        customer.setEmail("sam.newman@gmail.com");
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int customerId) {
        return customers.get(customerId);
    }

}
