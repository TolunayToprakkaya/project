package com.tolunay.toprakkaya.etiya.repository;

import com.tolunay.toprakkaya.etiya.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
 * ProductDetail Repository Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
@RepositoryRestResource(path = "productDetails", collectionResourceRel = "productDetails", exported = false)
public interface ProductDetailRepository extends JpaRepository<ProductDetail, String> {
}
