package com.tolunay.toprakkaya.etiya.repository;

import com.tolunay.toprakkaya.etiya.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
 * Product Repository Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
@RepositoryRestResource(path = "products", collectionResourceRel = "products", exported = false)
public interface ProductRepository extends JpaRepository<Product, String> {
}
