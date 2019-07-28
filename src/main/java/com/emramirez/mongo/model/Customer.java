package com.emramirez.mongo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class Customer {

    private String name;
    private String lastName;
    private int phone;
    private LocalDate birthDate;
    private String nationality;
    private Address address;
    private List<Preference> preferences;
}
