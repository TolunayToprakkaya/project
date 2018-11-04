package com.tolunay.toprakkaya.etiya.controller;

import com.tolunay.toprakkaya.etiya.model.Customer;
import com.tolunay.toprakkaya.etiya.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * Customer Controller Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    @Qualifier("customerService")
    private CustomerService customerService;

    //FindAll
    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    //Save
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Customer customer){
        customerService.save(customer);
    }

    //Update
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Customer product){
        customerService.update(product);
    }

    //Delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        customerService.delete(id);
    }

}
