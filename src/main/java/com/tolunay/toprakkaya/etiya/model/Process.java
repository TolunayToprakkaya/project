package com.tolunay.toprakkaya.etiya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tolunay.toprakkaya.etiya.model.seedwork.AbstractEntity;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity
@Table(name = "T_PROCESS")
public class Process extends AbstractEntity{

    @RestResource(exported = false)
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @RestResource(exported = false)
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @JsonIgnore
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonIgnore
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

}
