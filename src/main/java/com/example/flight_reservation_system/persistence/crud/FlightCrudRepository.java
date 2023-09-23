package com.example.flight_reservation_system.persistence.crud;

import com.example.flight_reservation_system.persistence.entity.Flight;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightCrudRepository extends CrudRepository<Flight, String> {

    //Creamos este método porque vamos a útilizar un Query Method
    //Este método permite recuperar una lista de vuelos por código
    List<Flight> findByCodeFlight(String codeFlight);
    List<Flight> findByOriginAndDestinationAndDepartureDate(String origin, String destination, LocalDateTime departureDate);
    //Segundo método pero utilizando un Query Method


}
