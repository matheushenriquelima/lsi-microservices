package com.matheus.lima.restaurant.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Restaurant {

    @Id
    private Long id;
    private String acronym;
    private Boolean active;


}
