package com.matheus.lima.reservation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Reservation {

    @Id
    private Long id;
    private String restaurantName;
    private LocalDate date;

}
