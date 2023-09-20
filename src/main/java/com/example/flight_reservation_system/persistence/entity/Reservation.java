package com.example.flight_reservation_system.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @Column(name = "code_reservation")
    private String codeReservation;
    @Column(name = "reservation_date")
    private LocalDateTime reservationDate;
    @Column(name = "seat_number")
    private Integer seatNumber;
    @Column(name = "code_fligth")
    private String codeFligth;
    @Column(name = "id_passenger")
    private String idPassenger;

    //Creamos las relaciones entre entidades
    @ManyToOne
    @JoinColumn(name = "code_flight", insertable = false, updatable = false)
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "code_reservation", insertable = false, updatable = false)
    private Itinerary itinerary;

    @ManyToOne
    @JoinColumn(name = "id_passenger", insertable = false, updatable = false)
    private Passenger passenger;

    public String getCodeReservation() {
        return codeReservation;
    }

    public void setCodeReservation(String codeReservation) {
        this.codeReservation = codeReservation;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCodeFligth() {
        return codeFligth;
    }

    public void setCodeFligth(String codeFligth) {
        this.codeFligth = codeFligth;
    }

    public String getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(String idPassenger) {
        this.idPassenger = idPassenger;
    }
}
