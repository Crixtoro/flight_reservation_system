package com.example.flight_reservation_system.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "passenger")
public class Passenger {

    @Id
    @Column(name = "id_passenger")
    private String idPassenger;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String nationality;
    private String email;
    private String phone;

    //Creamos las relaciones de las entidades
    @OneToMany(mappedBy = "passenger")
    private List<Itinerary> itineraries;
    @OneToMany(mappedBy = "passenger")
    private List<Reservation> reservations;

    public String getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(String idPassenger) {
        this.idPassenger = idPassenger;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
