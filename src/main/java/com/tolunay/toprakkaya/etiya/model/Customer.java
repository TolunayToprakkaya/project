package com.tolunay.toprakkaya.etiya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tolunay.toprakkaya.etiya.model.seedwork.AbstractEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
 * Etiya DB'deki T_CUSTOMER tablosunu elemanları oluşturuldu.
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
@Entity
@Table(name = "T_CUSTOMER")
public class Customer extends AbstractEntity{

    @Column(name = "username")
    private String username;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private Set<Product> products = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private Set<ProductDetail> productDetails = new HashSet<>();

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonIgnore
    public Set<Product> getProducts() {
        return products;
    }
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @JsonIgnore
    public Set<ProductDetail> getProductDetails() {
        return productDetails;
    }
    public void setProductDetails(Set<ProductDetail> productDetails) {
        this.productDetails = productDetails;
    }

}
