package com.example.flight_reservation_system.persistence.crud;

import com.example.flight_reservation_system.persistence.entity.Itinerary;
import org.springframework.data.repository.CrudRepository;

public interface ItineraryCrudRepository extends CrudRepository<Itinerary, String> {

}
