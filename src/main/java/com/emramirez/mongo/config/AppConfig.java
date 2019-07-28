package com.emramirez.mongo.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class AppConfig {

    /*
     * Use the standard Mongo driver API to create a com.mongodb.MongoClient instance.
     */
    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("localhost");
    }

    /*
     * Factory bean that creates the com.mongodb.MongoClient instance
     * This has the benefit or exception translation from Mongo to Data exceptions for classes marked as repository
     */
//    @Bean
//    public MongoClientFactoryBean mongo() {
//        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
//        mongo.setHost("localhost");
//        return mongo;
//    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "ramses");
    }
}
