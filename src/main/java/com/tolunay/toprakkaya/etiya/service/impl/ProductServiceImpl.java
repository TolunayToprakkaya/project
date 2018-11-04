package com.tolunay.toprakkaya.etiya.service.impl;

import com.tolunay.toprakkaya.etiya.model.Product;
import com.tolunay.toprakkaya.etiya.repository.ProductRepository;
import com.tolunay.toprakkaya.etiya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/*
 * Product Service Implementinden Gelenler Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
@Service("productService")
public class ProductServiceImpl  implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> findOneById(String id) {
        return this.productRepository.findById(id);
    }

    @Transactional
    @Override
    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    @Transactional
    @Override
    public Product update(Product product) {
        return this.productRepository.save(product);
    }

    @Transactional
    @Override
    public void delete(String id) {
        this.productRepository.deleteById(id);
    }
}
