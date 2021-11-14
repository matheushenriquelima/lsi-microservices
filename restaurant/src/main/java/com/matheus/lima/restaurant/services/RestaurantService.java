package com.matheus.lima.restaurant.services;

import com.matheus.lima.restaurant.entity.Restaurant;
import com.matheus.lima.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository repository;

    public void create(Restaurant restaurant) {
        repository.save(restaurant);
    }

    public void update(Restaurant restaurant) {
        if (Objects.nonNull(restaurant.getId())) {
            repository.save(restaurant);
        }
    }

    public List<Restaurant> getAll() {
        List<Restaurant> restaurants = new ArrayList<>();
        repository.findAll().forEach(restaurants::add);
        return restaurants;
    }

    public Optional<Restaurant> getById(Long id) {
        return repository.findById(id);
    }

}
