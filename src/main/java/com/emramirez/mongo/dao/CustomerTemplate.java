package com.emramirez.mongo.dao;

import com.emramirez.mongo.model.Customer;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Component
public class CustomerTemplate {

    private final MongoOperations mongoOperations;

    @Autowired
    public CustomerTemplate(MongoClient mongoClient) {
        mongoOperations = new MongoTemplate(mongoClient, "customers");
    }

    public Customer create(Customer customer) {
        return mongoOperations.insert(customer);
    }

    public Customer findOneByName(String name) {
        return mongoOperations.findOne(new Query(where("name").is(name)), Customer.class);
    }

    public Customer findAllByName(String name) {
        return mongoOperations.findOne(new Query(where("name").is(name)), Customer.class);
    }
}
