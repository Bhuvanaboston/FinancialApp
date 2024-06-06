package com.example.customerms;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;


    RestTemplate restTemplate;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, RestTemplate restTemplate) {
        this.customerRepository = customerRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Customer> findAll() {
       // List<CreditInfo> creditList=new ArrayList<>();
      //  CreditInfo response =restTemplate.getForObject("http://localhost:8081/credits",)
     //   System.out.println("DAtaaa: "+response);
        return null;
                //customerRepository.findAll();
    }
}
