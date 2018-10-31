package com.tolunay.toprakkaya.etiya.service;

import com.tolunay.toprakkaya.etiya.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> findAll();
    Optional<Customer> findOneById(String id);
    Customer save(Customer customer);
    Customer update(Customer customer);
    void delete(String id);

}
