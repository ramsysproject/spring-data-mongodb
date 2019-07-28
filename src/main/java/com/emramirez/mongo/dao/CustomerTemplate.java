package com.emramirez.mongo.dao;

import com.emramirez.mongo.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Component
@RequiredArgsConstructor
public class CustomerTemplate {

    private final MongoOperations mongoOperations;

    public Customer create(Customer customer) {
        return mongoOperations.insert(customer);
    }

    public Customer findOneByName(String name) {
        return mongoOperations.findOne(new Query(where("name").is(name)), Customer.class);
    }

    public List<Customer> findAllByName(String name) {
        return mongoOperations.find(new Query(where("name").is(name)), Customer.class);
    }
}
