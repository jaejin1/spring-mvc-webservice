package com.jaejin.springmvc.service;

import com.jaejin.springmvc.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List <Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
