package com.tolunay.toprakkaya.etiya.service;

import com.tolunay.toprakkaya.etiya.model.Customer;

import java.util.List;
import java.util.Optional;

/*
 * Customer Service Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
public interface CustomerService {

    List<Customer> findAll();
    Optional<Customer> findOneById(String id);
    Customer save(Customer customer);
    Customer update(Customer customer);
    void delete(String id);

}
