package com.unittest.service;

import com.unittest.model.Customer;
import com.unittest.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer add(Customer customer) {
        return customerRepository.add(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }
}