package com.example.flight_reservation_system.persistence.crud;

import com.example.flight_reservation_system.persistence.entity.Flight;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface FlightCrudRepository extends CrudRepository<Flight, String> {
    /**
     * Método que nos permite consultar todos los vuelos por medio de la llave primaria
     * codeFlight
     * @param codeFlight
     * @return List<Flight>
     */
    List<Flight> findByCodeFlight(String codeFlight);

}
