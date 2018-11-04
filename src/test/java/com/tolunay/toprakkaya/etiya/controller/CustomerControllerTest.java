package com.tolunay.toprakkaya.etiya.controller;

import com.tolunay.toprakkaya.etiya.model.Customer;
import com.tolunay.toprakkaya.etiya.service.CustomerService;
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
@WebMvcTest(value = CustomerController.class, secure = false)
public class CustomerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Qualifier("customerService")
    @MockBean
    CustomerService customerService;

    private Customer customer;

    @Before
    public void prepare(){
        customer = new Customer();
        customer.setId("d9a4ad55-25c1-42e9-aa11-8c214ce912de");
        customer.setUsername("canyılmaz");
        customer.setName("Can");
        customer.setSurname("Yılmaz");
        customer.setPassword("cy123");
    }

    @Test
    public void noDataTest() throws Exception{
        List<Customer> customers = customerService.findAll();

        assertThat(customers.size(), is(0));
    }

    @Test
    public void findAllTest() throws Exception{
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(customer);

        assertThat(customers.size(), is(1));
        assertThat(customers.get(0).getId(), is("d9a4ad55-25c1-42e9-aa11-8c214ce912de"));
    }

    @Test
    public void findOneByIdTest() throws Exception{
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(customer);

        Optional<Customer>  optionalCustomer = customerService.findOneById("d9a4ad55-25c1-42e9-aa11-8c214ce912de");

        Assertions.assertThat(customer).isEqualTo(customer);
    }

    @Test
    public void saveTest() throws Exception{
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(customer);

        assertThat(customers.size(), is(1));
        assertThat(customers.get(0).getId(), is("d9a4ad55-25c1-42e9-aa11-8c214ce912de"));
    }

    @Test
    public void deleteTest() throws Exception{
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(customer);

        customerService.delete("d9a4ad55-25c1-42e9-aa11-8c214ce912de");
        Assertions.assertThat(customerService.findAll()).isEmpty();
    }

}
