package com.tolunay.toprakkaya.etiya.service;

import com.tolunay.toprakkaya.etiya.model.Product;

import java.util.List;
import java.util.Optional;

/*
 * Product Service Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
public interface ProductService {

    List<Product> findAll();
    Optional<Product> findOneById(String id);
    Product save(Product product);
    Product update(Product product);
    void delete(String id);

}
