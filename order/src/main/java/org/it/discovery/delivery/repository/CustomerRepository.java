package org.it.discovery.delivery.repository;


import org.it.discovery.delivery.domain.Customer;

public interface CustomerRepository {

    Customer findById(int customerId);


}
