package com.example.flight_reservation_system.persistence.crud;

import com.example.flight_reservation_system.persistence.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, String> {

}
