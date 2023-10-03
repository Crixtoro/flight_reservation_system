package com.example.flight_reservation_system.domain;

import com.example.flight_reservation_system.persistence.entity.Airline;
import com.example.flight_reservation_system.persistence.entity.Reservation;
import com.example.flight_reservation_system.persistence.entity.SelectFlightType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;
import java.util.List;

public class FlightDTO {
    private String codeFlight;
    private String codeReservation;
    private String origin;
    private String destination;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
    private Double price;
    private Integer availableSeats;
    @Enumerated(EnumType.STRING)
    private SelectFlightType selectFlightType;
    @Enumerated(EnumType.STRING)
    private Airline airline;
    private boolean stopover;
    private List<Reservation> reservationList;

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

    public SelectFlightType getSelectFlightType() {
        return selectFlightType;
    }

    public void setSelectFlightType(SelectFlightType selectFlightType) {
        this.selectFlightType = selectFlightType;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public boolean isStopover() {
        return stopover;
    }

    public void setStopover(boolean stopover) {
        this.stopover = stopover;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
