package com.example.flight_reservation_system.persistence;

import com.example.flight_reservation_system.persistence.crud.PassengerCrudRepository;
import com.example.flight_reservation_system.persistence.entity.Passenger;
import com.example.flight_reservation_system.persistence.entity.Reservation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PassengerRepository {
    private PassengerCrudRepository passengerCrudRepository;

    List<Passenger> getAllPassenger() {
        return (List<Passenger>) passengerCrudRepository.findAll();
    }

    Passenger save(Passenger passenger) {
        return passengerCrudRepository.save(passenger);
    }

    public void delete(String idPassenger) {
        passengerCrudRepository.deleteById(idPassenger);
    }

    public Passenger uodatePassenger(String idPassenger, Passenger updatedPassenger) {
        if(passengerCrudRepository.existsById(idPassenger)) {
            updatedPassenger.setIdPassenger(idPassenger);
            return passengerCrudRepository.save(updatedPassenger);
        } else {
            return null; //Definir manejo de excepciones
        }
    }
}
