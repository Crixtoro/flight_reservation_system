package com.example.flight_reservation_system.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo")
public class ejemploController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola mundo";
    }
}
