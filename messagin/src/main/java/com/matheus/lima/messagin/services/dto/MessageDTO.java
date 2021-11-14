package com.matheus.lima.messagin.services.dto;

import lombok.Data;

@Data
public class MessageDTO {

    private String accountFrom;
    private String accountTo;
    private String message;

}
