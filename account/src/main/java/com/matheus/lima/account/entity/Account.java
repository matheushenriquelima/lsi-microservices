package com.matheus.lima.account.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Account {

    @Id
    public Long id;

    public String name;

    public Integer age;

}
