package com.example.kiselev.demo.micros1.controller;

import com.example.kiselev.demo.micros1.model.CustomerDTO;
import com.example.kiselev.demo.micros1.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public void addCustomer(@RequestParam int id, @RequestParam String name) {
        customerService.addCustomer(id, name);
    }

    @GetMapping
    public CustomerDTO getCustomer(@RequestParam int id) {
        return customerService.getCustomer(id);
    }
}
