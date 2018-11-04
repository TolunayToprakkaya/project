package com.tolunay.toprakkaya.etiya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tolunay.toprakkaya.etiya.model.seedwork.AbstractEntity;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/*
 * Etiya DB'deki T_PROCESS tablosunu elemanları oluşturuldu.
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
@Entity
@Table(name = "T_PRODUCT_DETAIL")
public class ProductDetail extends AbstractEntity{

    @Column(name = "detail_part")
    private String detailPart;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "return_date")
    private Date returnDate;

    @RestResource(exported = false)
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //@RestResource(exported = false)
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public String getDetailPart() {
        return detailPart;
    }
    public void setDetailPart(String detailPart) {
        this.detailPart = detailPart;
    }

    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @JsonIgnore
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Transient
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

}
