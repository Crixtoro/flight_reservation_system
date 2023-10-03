package com.example.flight_reservation_system.domain.repository;

import com.example.flight_reservation_system.persistence.entity.Flight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface FlightDtoRepository {

    List<Flight> getAll();
    Flight save(Flight flight);
    Optional<List<Flight>> detailFlight(String codeFlight);
    void delete(String codeFlight);
    Flight updateFlight(String codeFlight, Flight updatedFlight);
    Optional<List<Flight>> getFlightByCriterial(String origin, String destination, LocalDateTime departureDate);
    //Es mejor que retorne un Optional por que puede estar vacío
}
