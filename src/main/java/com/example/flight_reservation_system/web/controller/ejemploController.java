package com.example.flight_reservation_system.web.controller;

import com.example.flight_reservation_system.domain.service.FlightService;
import com.example.flight_reservation_system.persistence.entity.Flight;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ejemplo")
public class ejemploController {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola mundo";
    }

    private FlightService flightService;

    @PostMapping("/vuelo")
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);
        return ResponseEntity.ok(flight);
    }

}
