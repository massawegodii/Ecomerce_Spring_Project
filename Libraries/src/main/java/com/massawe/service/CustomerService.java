package com.massawe.service;

import com.massawe.dto.CustomerDto;
import com.massawe.models.Customer;

public interface CustomerService {

    CustomerDto save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer saveInfor(Customer customer);
}
