package com.example.demo.controller;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.example.demo.api.CustomerApi;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerEntity;
import com.example.demo.repository.CustomerRepository;

@Controller
public class RestController implements CustomerApi {

    private CustomerRepository repository;

    @Autowired
    public void setRepository(final CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<String> addCustomer(final Customer customer) {
        final CustomerEntity entity = new CustomerEntity();
        entity.setAge(customer.getAge());
        entity.setId(customer.getId());
        entity.setRegistration(customer.getRegistrationDate()
                                       .toString());
        repository.save(entity);
        return ResponseEntity.ok(" is added");
    }

    @Override
    public ResponseEntity<List<Customer>> getCustomer() {
        final List<CustomerEntity> entities = repository.findAll();
        final List<Customer> customers = new ArrayList<>();
        for (final CustomerEntity entity : entities) {
            final Customer customer = new Customer();
            customer.setAge(entity.getAge());
            customer.setId(entity.getId());
            customer.setRegistrationDate(OffsetDateTime.parse(entity.getRegistration()));
            customers.add(customer);
        }
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }
}
