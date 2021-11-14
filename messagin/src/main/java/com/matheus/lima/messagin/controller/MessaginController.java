package com.matheus.lima.messagin.controller;

import com.matheus.lima.messagin.services.MessageService;
import com.matheus.lima.messagin.services.dto.MessageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/messagin")
public class MessaginController {

    private final MessageService service;

    @PostMapping("/sent")
    public ResponseEntity<String> getMessage(@RequestBody MessageDTO messageDTO) {
        return ResponseEntity.ok(service.send(messageDTO));
    }

}
