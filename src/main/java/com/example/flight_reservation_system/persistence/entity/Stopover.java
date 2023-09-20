package com.example.flight_reservation_system.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "stopover")
public class Stopover {
    @Id
    @Column(name = "id_stopover")
    private String idStopover;
    private String city;
    @Column(name = "arrival_date")
    private LocalDateTime arrivalDate;

    //Creamos las relaciones entre entidades
    @ManyToOne
    @JoinColumn(name = "id_stopover", insertable = false, updatable = false)
    private Flight flight;

    public String getIdStopover() {
        return idStopover;
    }

    public void setIdStopover(String idStopover) {
        this.idStopover = idStopover;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

}
