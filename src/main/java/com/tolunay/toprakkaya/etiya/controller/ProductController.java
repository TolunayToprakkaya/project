package com.tolunay.toprakkaya.etiya.controller;

import com.tolunay.toprakkaya.etiya.model.Product;
import com.tolunay.toprakkaya.etiya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * Product Controller Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    @Qualifier("productService")
    private ProductService productService;

    //FindAll
    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Product> findAll(){
        return productService.findAll();
    }

    //Save
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public void save(@RequestBody Product product){
        productService.save(product);
    }

    //Update
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @CrossOrigin(origins = "http://localhost:4200")
    public void update(@RequestBody Product product){
        productService.update(product);
    }

    //Delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:4200")
    public void delete(@PathVariable String id){
        productService.delete(id);
    }

}
