package com.example.flight_reservation_system.persistence;

import com.example.flight_reservation_system.persistence.crud.ItineraryCrudRepository;
import com.example.flight_reservation_system.persistence.entity.Itinerary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Este repositorio proporciona acceso a todos los datos de la clase "Itinerary" de la base de datos
 * @version 1.0
 */
@Repository
public class ItineraryRepository {
    private ItineraryCrudRepository itineraryCrudRepository;

    /**
     * Consulta todos los elementos de la clase Itinerary
     * @return una lista de tipo Itinerary con todos los datos de la tabla
     */
    public List<Itinerary> getAll(){
        return (List<Itinerary>) itineraryCrudRepository.findAll();
    }

}
