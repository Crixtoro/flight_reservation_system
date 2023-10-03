package com.example.flight_reservation_system.persistence.mapper;

import com.example.flight_reservation_system.domain.FlightDTO;
import com.example.flight_reservation_system.persistence.entity.Flight;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
interface FlightMapper {

    FlightDTO toFlightDTO(Flight flight);

    @InheritInverseConfiguration
    Flight toFlight(FlightDTO flightDTO);
}
