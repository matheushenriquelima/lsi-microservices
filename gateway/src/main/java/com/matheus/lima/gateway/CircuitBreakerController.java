package com.matheus.lima.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class CircuitBreakerController {

    @GetMapping("/account")
    public String accountServiceFallback() {
        return "Fallback do Account";
    }

    @GetMapping("/search")
    public String searchServiceFallback() {
        return "Fallback do Search";
    }

    @GetMapping("/restaurant")
    public String restaurantServiceFallback() {
        return "Fallback do Restaurant";
    }

    @GetMapping("/reservation")
    public String reservationServiceFallback() {
        return "Fallback do Reservation";
    }

    @GetMapping("/messagin")
    public String messaginServiceFallback() {
        return "Fallback do Messagin";
    }

}
