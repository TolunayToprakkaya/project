package com.tolunay.toprakkaya.etiya.controller;

import com.tolunay.toprakkaya.etiya.model.Product;
import com.tolunay.toprakkaya.etiya.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductController.class, secure = false)
public class ProductControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Qualifier("productService")
    @MockBean
    private ProductService productService;

    private Product product;

    @Before
    public void prepare() {
        product = new Product();
        product.setId("d9a4ad55-25c1-42e9-aa11-8c214ce912de");
        product.setName("Saat");
    }

    @Test
    public void noDataTest() throws Exception{
        List<Product> products = productService.findAll();

        assertThat(products).isEmpty();
    }

    @Test
    public void findAllTest() throws Exception{
        List<Product> products = new ArrayList<Product>();
        products.add(product);

        assertThat(products.size(), is(1));
        assertThat(products.get(0).getId(), is("d9a4ad55-25c1-42e9-aa11-8c214ce912de"));
    }

    @Test
    public void findOneTest() throws Exception{
        List<Product> products = new ArrayList<Product>();
        products.add(product);

        Optional<Product> optionalProduct = productService.findOneById("d9a4ad55-25c1-42e9-aa11-8c214ce912de");

        assertThat(product).isEqualTo(product);
    }

    @Test
    public void saveTest() throws Exception{
        List<Product> products = new ArrayList<Product>();
        products.add(product);

        assertThat(products.size(), is(1));
        assertThat(products.get(0).getId(), is("d9a4ad55-25c1-42e9-aa11-8c214ce912de"));
    }

    @Test
    public void deleteTest() throws Exception{
        List<Product> products = new ArrayList<Product>();
        products.add(product);

        productService.delete("d9a4ad55-25c1-42e9-aa11-8c214ce912de");

        assertThat(productService.findAll().isEmpty());
    }

}
