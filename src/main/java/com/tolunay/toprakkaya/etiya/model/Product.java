package com.tolunay.toprakkaya.etiya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tolunay.toprakkaya.etiya.model.enums.ProductPart;
import com.tolunay.toprakkaya.etiya.model.seedwork.AbstractEntity;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/*
* Etiya DB'deki T_PRODUCT tablosunu elemanları oluşturuldu.
*
* @author Tolunay Toprakkaya
* @since 31.10.2018
*/
@Entity
@Table(name = "T_PRODUCT")
public class Product extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "part")
    @Enumerated(EnumType.ORDINAL)
    private ProductPart part;

    @RestResource(exported = false)
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @RestResource(exported = false)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    private Set<ProductDetail> productDetails = new HashSet<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ProductPart getPart() {
        return part;
    }
    public void setPart(ProductPart part) {
        this.part = part;
    }

    @Transient
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonIgnore
    public Set<ProductDetail> getProductDetails() {
        return productDetails;
    }
    public void setProductDetails(Set<ProductDetail> productDetails) {
        this.productDetails = productDetails;
    }

}
