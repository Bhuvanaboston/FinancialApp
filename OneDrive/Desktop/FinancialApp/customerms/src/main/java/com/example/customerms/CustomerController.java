package com.example.customerms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {


    private CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getDebitInfo() {
        List<Customer> customer = customerService.findAll();
        if(customer.isEmpty())
            return  new ResponseEntity<>(HttpStatus.FORBIDDEN);
        return  ResponseEntity.ok(customer);

    }


}
