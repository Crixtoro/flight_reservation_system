package com.example.flight_reservation_system.persistence.crud;

import com.example.flight_reservation_system.persistence.entity.Flight;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightCrudRepository extends CrudRepository<Flight, String> {

    List<Flight> findByOriginAndDestinationAndDepartureDate(String origin, String destination, LocalDateTime departureDate);
    //Segundo método pero utilizando un Query Method

    List<Flight> findByStopover(boolean available);

}
