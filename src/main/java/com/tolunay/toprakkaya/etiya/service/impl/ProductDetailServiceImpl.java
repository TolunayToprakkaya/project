package com.tolunay.toprakkaya.etiya.service.impl;

import com.tolunay.toprakkaya.etiya.model.ProductDetail;
import com.tolunay.toprakkaya.etiya.repository.ProductDetailRepository;
import com.tolunay.toprakkaya.etiya.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/*
 * ProductDetail Service Implementinden Gelenler Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
@Service("productDetailService")
public class ProductDetailServiceImpl implements ProductDetailService {

    @Autowired
    private ProductDetailRepository productDetailRepository;

    @Override
    public List<ProductDetail> findAll() {
        return this.productDetailRepository.findAll();
    }

    @Override
    public Optional<ProductDetail> findOneById(String id) {
        return this.productDetailRepository.findById(id);
    }

    @Transactional
    @Override
    public ProductDetail save(ProductDetail productDetail) {
        return this.productDetailRepository.save(productDetail);
    }

    @Transactional
    @Override
    public ProductDetail update(ProductDetail productDetail) {
        return this.productDetailRepository.save(productDetail);
    }

    @Transactional
    @Override
    public void delete(String id) {
        this.productDetailRepository.deleteById(id);
    }
}
