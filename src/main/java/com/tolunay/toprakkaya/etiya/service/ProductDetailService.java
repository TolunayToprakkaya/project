package com.tolunay.toprakkaya.etiya.service;

import com.tolunay.toprakkaya.etiya.model.ProductDetail;

import java.util.List;
import java.util.Optional;

/*
 * ProductDetail Service Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
public interface ProductDetailService {

    List<ProductDetail> findAll();
    Optional<ProductDetail> findOneById(String id);
    ProductDetail save(ProductDetail productDetail);
    ProductDetail update(ProductDetail productDetail);
    void delete(String id);

}
