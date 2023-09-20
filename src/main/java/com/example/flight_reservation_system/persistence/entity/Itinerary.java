package com.example.flight_reservation_system.persistence.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "itinerary")
public class Itinerary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_itinerary")
    private String idItinerary;

    private String reservation;//Me genera dudas
    @Column(name = "code_reservation")
    private String codeReservation;
    @Column(name = "id_passenger")
    private String idPassenger;

    //Creamos las relaciones entre entidades
    @OneToMany(mappedBy = "itinerary")
    private List<Reservation> reservations;
    @ManyToOne
    @JoinColumn(name = "id_passenger", insertable = false, updatable = false)
    private Passenger passenger;

    public String getIdItinerary() {
        return idItinerary;
    }

    public void setIdItinerary(String idItinerary) {
        this.idItinerary = idItinerary;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public String getCodeReservation() {
        return codeReservation;
    }

    public void setCodeReservation(String codeReservation) {
        this.codeReservation = codeReservation;
    }

    public String getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(String idPassenger) {
        this.idPassenger = idPassenger;
    }
}
