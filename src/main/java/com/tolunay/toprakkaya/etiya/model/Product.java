package com.tolunay.toprakkaya.etiya.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tolunay.toprakkaya.etiya.model.enums.ProductPart;
import com.tolunay.toprakkaya.etiya.model.seedwork.AbstractEntity;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "T_PRODUCT")
public class Product extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "part")
    @Enumerated(EnumType.ORDINAL)
    private ProductPart part;

    @Column(name = "overhaul_date")
    private Timestamp overhaulDate;

    @RestResource(exported = false)
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    private Set<Process> processes = new HashSet<>();

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

    public Timestamp getOverhaulDate() {
        return overhaulDate;
    }
    public void setOverhaulDate(Timestamp overhaulDate) {
        this.overhaulDate = overhaulDate;
    }

    @JsonIgnore
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonIgnore
    public Set<Process> getProcesses() {
        return processes;
    }
    public void setProcesses(Set<Process> processes) {
        this.processes = processes;
    }

}
