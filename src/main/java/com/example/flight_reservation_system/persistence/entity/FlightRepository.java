package com.example.flight_reservation_system.persistence.entity;

import com.example.flight_reservation_system.persistence.crud.FlightCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class FlightRepository {
    private FlightCrudRepository flightCrudRepository;

    public List<Flight> getAll() {
        return (List<Flight>) flightCrudRepository.findAll();
    }
}
