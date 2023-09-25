package com.example.flight_reservation_system.persistence;

import com.example.flight_reservation_system.persistence.crud.ReservationCrudRepository;
import com.example.flight_reservation_system.persistence.entity.Reservation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservationRepository {
    private ReservationCrudRepository reservationCrudRepository;

    List<Reservation> getAllReservation() {
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    Reservation save(Reservation reservation) {
        return reservationCrudRepository.save(reservation);
    }

    public void delete(String codeReservation) {
        reservationCrudRepository.deleteById(codeReservation);
    }

    public Reservation updateReservation(String codeReservation, Reservation updatedReservation) {
        if(reservationCrudRepository.existsById(codeReservation)) {
            updatedReservation.setCodeReservation(codeReservation);
            return reservationCrudRepository.save(updatedReservation);
        } else {
            return null; //Definir manejo de excepciones
        }
    }
}
