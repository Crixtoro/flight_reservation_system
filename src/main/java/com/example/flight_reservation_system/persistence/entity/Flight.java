package com.example.flight_reservation_system.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @Column(name = "code_flight")
    private String codeFlight;
    @Column(name = "code_reservation")
    private String codeReservation;
    private String origin;
    private String destination;
    @Column(name = "departure_date")
    private LocalDateTime departureDate;
    @Column(name = "arrival_date")
    private LocalDateTime arrivalDate;
    private Double price;
    @Column(name = "available_seats")
    private Integer availableSeats;
    @Enumerated(EnumType.STRING)
    private SelectFlightType type;
    @Enumerated(EnumType.STRING)
    private Airline airline;
    @Column(name = "id_stopover")
    private String idStopover; //Revisar el tipo de dato (si es lista)

    //Creamos las relaciones entre las diferentes entidades
    @OneToMany(mappedBy = "flight")
    private List<Stopover> stopovers;

    @OneToMany(mappedBy = "flight")
    private List<Reservation> reservations;


    public String getCodeFlight() {
        return codeFlight;
    }

    public void setCodeFlight(String codeFlight) {
        this.codeFlight = codeFlight;
    }

    public String getCodeReservation() {
        return codeReservation;
    }

    public void setCodeReservation(String codeReservation) {
        this.codeReservation = codeReservation;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public SelectFlightType getType() {
        return type;
    }

    public void setType(SelectFlightType type) {
        this.type = type;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getIdStopover() {
        return idStopover;
    }

    public void setIdStopover(String idStopover) {
        this.idStopover = idStopover;
    }

}
