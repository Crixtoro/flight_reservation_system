package com.example.flight_reservation_system.persistence.crud;

import com.example.flight_reservation_system.persistence.entity.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerCrudRepository extends CrudRepository<Passenger, String> {

}
