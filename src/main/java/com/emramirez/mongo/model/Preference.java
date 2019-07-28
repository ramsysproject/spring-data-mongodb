package com.emramirez.mongo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class Preference {

    private String brand;
    private boolean active;
    private LocalDate from;
    private LocalDate to;
}
