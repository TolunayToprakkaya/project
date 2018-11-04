package com.tolunay.toprakkaya.etiya.controller;

import com.tolunay.toprakkaya.etiya.model.ProductDetail;
import com.tolunay.toprakkaya.etiya.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * ProductDetail Controller Eklendi
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
@RestController
@RequestMapping("/productDetails")
public class ProductDetailController {

    @Autowired
    @Qualifier("productDetailService")
    private ProductDetailService productDetailService;

    //FindAll
    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ProductDetail> findAll() {
        return productDetailService.findAll();
    }

    //Save
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public void save(@RequestBody ProductDetail productDetail){
        productDetailService.save(productDetail);
    }

    //Update
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @CrossOrigin(origins = "http://localhost:4200")
    public void update(@RequestBody ProductDetail productDetail){
        productDetailService.update(productDetail);
    }

    //Delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:4200")
    public void delete(@PathVariable String id){
        productDetailService.delete(id);
    }

}
