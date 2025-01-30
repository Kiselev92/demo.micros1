package com.example.kiselev.demo.micros1.service;

import com.example.kiselev.demo.micros1.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id, String name);

    CustomerDTO getCustomer(int id);
    }

