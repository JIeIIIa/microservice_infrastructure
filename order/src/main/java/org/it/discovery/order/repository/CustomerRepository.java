package org.it.discovery.order.repository;


import org.it.discovery.order.domain.Customer;

public interface CustomerRepository {

    Customer findById(int customerId);


}
