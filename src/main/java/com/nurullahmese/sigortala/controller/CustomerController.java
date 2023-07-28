package com.nurullahmese.sigortala.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nurullahmese.sigortala.entitiy.Customer;
import com.nurullahmese.sigortala.services.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/test")
    public String getTest() {
        return "TEST SUCCESSFUL";
    }

    @GetMapping("")
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @PostMapping("")
    public String add(@RequestBody Customer customer) {
        customerService.add(customer);
        return "SUCCESSFUL ADDED";
    }

}
