package com.emramirez.mongo.controller;

import com.emramirez.mongo.dao.CustomerTemplate;
import com.emramirez.mongo.model.Customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
@Slf4j
public class ClientController {

    private final CustomerTemplate customerTemplate;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity create(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerTemplate.create(customer));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity findByName(@RequestParam String name) {
        List<Customer> customers = customerTemplate.findAllByName(name);

        return ResponseEntity.ok(customers);
    }
}
