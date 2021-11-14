package com.matheus.lima.search.services.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SearchDTO {

    private String word;
    private LocalDate date;
    private String accountName;

}
