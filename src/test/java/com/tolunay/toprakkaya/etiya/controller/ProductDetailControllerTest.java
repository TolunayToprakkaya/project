package com.tolunay.toprakkaya.etiya.controller;

import com.tolunay.toprakkaya.etiya.model.ProductDetail;
import com.tolunay.toprakkaya.etiya.service.ProductDetailService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductDetailController.class, secure = false)
public class ProductDetailControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Qualifier("productDetailService")
    @MockBean
    private ProductDetailService productDetailService;

    private ProductDetail productDetail;

    @Before
    public void prepare(){
        productDetail = new ProductDetail();
        productDetail.setId("d9a4ad55-25c1-42e9-aa11-8c214ce912de");
    }

    @Test
    public void noDataTest() throws Exception{
        List<ProductDetail> productDetails = productDetailService.findAll();

        assertThat(productDetails.size(), is(0));
    }

    @Test
    public void findAllTest() throws Exception{
        List<ProductDetail> productDetails = new ArrayList<ProductDetail>();
        productDetails.add(productDetail);

        assertThat(productDetails.size(), is(1));
        assertThat(productDetails.get(0).getId(), is("d9a4ad55-25c1-42e9-aa11-8c214ce912de"));
    }

    @Test
    public void findOneByIdTest() throws Exception{
        List<ProductDetail> productDetails = new ArrayList<ProductDetail>();
        productDetails.add(productDetail);

        Optional<ProductDetail> optionalProductDetail = productDetailService.findOneById("d9a4ad55-25c1-42e9-aa11-8c214ce912de");

        Assertions.assertThat(productDetail).isEqualTo(productDetail);
    }

    @Test
    public void saveTest() throws Exception{
        List<ProductDetail> productDetails = new ArrayList<ProductDetail>();
        productDetails.add(productDetail);

        assertThat(productDetails.size(), is(1));
        assertThat(productDetails.get(0).getId(), is("d9a4ad55-25c1-42e9-aa11-8c214ce912de"));
    }

    @Test
    public void deleteTest() throws Exception{
        List<ProductDetail> productDetails = new ArrayList<ProductDetail>();
        productDetails.add(productDetail);

        productDetailService.delete("d9a4ad55-25c1-42e9-aa11-8c214ce912de");
        Assertions.assertThat(productDetailService.findAll()).isEmpty();
    }

}
