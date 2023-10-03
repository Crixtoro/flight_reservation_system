package com.example.flight_reservation_system.persistence;

import com.example.flight_reservation_system.persistence.crud.ReservationCrudRepository;
import com.example.flight_reservation_system.persistence.entity.Reservation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservationRepository {
    private ReservationCrudRepository reservationCrudRepository;

    /**
     * Obtener las reservas
     * @return
     */
    List<Reservation> getAllReservation() {
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    /**
     * Crear una reserva
     * @param reservation
     * @return
     */
    Reservation save(Reservation reservation) { // Falta
        return reservationCrudRepository.save(reservation);
    }

    /**
     * Borra una reserva
     * @param codeReservation
     */
    public void delete(String codeReservation) {
        reservationCrudRepository.deleteById(codeReservation);
    }

    /**
     * Actualizar una reserva
     * @param codeReservation
     * @param updatedReservation
     * @return
     */
    public Reservation updateReservation(String codeReservation, Reservation updatedReservation) {
        if(reservationCrudRepository.existsById(codeReservation)) {
            updatedReservation.setCodeReservation(codeReservation);
            return reservationCrudRepository.save(updatedReservation);
        } else {
            return null; //Definir manejo de excepciones
        }
    }
}
