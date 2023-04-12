package com.unittest.service;


import com.unittest.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer add(Customer customer);

    Customer findById(int id);
}