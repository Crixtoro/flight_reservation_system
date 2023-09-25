package com.example.flight_reservation_system.persistence.crud;

import com.example.flight_reservation_system.persistence.entity.Stopover;
import org.springframework.data.repository.CrudRepository;

public interface StopoverCrudRepository extends CrudRepository<Stopover, String> {
}
