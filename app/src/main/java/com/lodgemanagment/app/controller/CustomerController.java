package com.lodgemanagment.app.controller;

import com.lodgemanagment.app.entity.Customer;
import com.lodgemanagment.app.repository.Customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private Customerrepository customerrepository;
  @PostMapping
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return  customerrepository.save(customer);
    }

}
