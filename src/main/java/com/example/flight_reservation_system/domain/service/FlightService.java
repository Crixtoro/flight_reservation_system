package com.example.flight_reservation_system.domain.service;

import com.example.flight_reservation_system.persistence.crud.FlightCrudRepository;
import com.example.flight_reservation_system.persistence.entity.Flight;
import com.example.flight_reservation_system.persistence.entity.FlightRepository;

public class FlightService {

    private FlightCrudRepository flightCrudRepository;
    public void createFlight(Flight flight) {
       flightCrudRepository.save(flight);
    }
}
