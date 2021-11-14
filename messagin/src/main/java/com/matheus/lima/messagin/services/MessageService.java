package com.matheus.lima.messagin.services;

import com.matheus.lima.messagin.services.dto.MessageDTO;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String send(MessageDTO messageDTO) {
        return "Mensagem de: " + messageDTO.getAccountFrom() + " para: " + messageDTO.getAccountTo() + "\n" + messageDTO.getMessage();
    }

}
