package com.matheus.lima.reservation.services;

import com.matheus.lima.reservation.entity.Reservation;
import com.matheus.lima.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ReservationService {

    private final ReservationRepository repository;

    public void create(Reservation reservation) {
        repository.save(reservation);
    }

    public void update(Reservation reservation) {
        if (Objects.nonNull(reservation.getId())) {
            repository.save(reservation);
        }
    }

    public List<Reservation> getAll() {
        List<Reservation> reservations = new ArrayList<>();
        repository.findAll().forEach(reservations::add);
        return reservations;
    }

    public Optional<Reservation> getById(Long id) {
        return repository.findById(id);
    }
}
