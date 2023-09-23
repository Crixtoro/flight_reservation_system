package com.example.flight_reservation_system.persistence;

import com.example.flight_reservation_system.persistence.crud.FlightCrudRepository;
import com.example.flight_reservation_system.persistence.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/*Con la anotación @Repository le indicamos a Spring que esta clase es la encargada de interactuar
con la base de datos*/
@Repository
public class FlightRepository {
    private FlightCrudRepository flightCrudRepository;

    /*Creamos un método que recupere una lista con todos los vuelos que tenemos en nuestra base de datos,
    utilizamos el CrudRepository ya que es una consulta sencilla
     */
    public List<Flight> getAll() {
        return (List<Flight>) flightCrudRepository.findAll();
    }

    public Flight save(Flight flight){
        return flightCrudRepository.save(flight);
    }

    /*Se debe crear el endpoint POST /v1/flights que permita crear un vuelo en el sistema.
    Notas:
    - Todos los datos son requeridos
    - El código del vuelo se debe generar teniendo en cuenta la aerolínea y un número consecutivo, de la siguiente manera:
    { primeras dos letras de la aerolínea }{ código consecutivo de 4 dígitos }, ejemplo: si la aerolínea es AVIANCA y es el
     primer vuelo el código sería
       AV 0001.*/

    public void delete(String codeFlight) {
        flightCrudRepository.deleteById(codeFlight);
    }

    public Flight updateFlight(String codeFlight, Flight updatedFlight) {
        if (flightCrudRepository.existsById(codeFlight)) {
            updatedFlight.setCodeFlight(codeFlight);
            return flightCrudRepository.save(updatedFlight);
        } else {
            return null; //Definir manejo de excepciones
        }
    }

    //Creamos un segundo método pero utilizando los Query Methods
    public List<Flight> getByCodeFlight(String codeFlight) {
        return flightCrudRepository.findByCodeFlight(codeFlight); //Este es el método que definimos en el CRUD
    }

    public List<Flight> getFlightByCriteria(String origin, String destination, LocalDateTime departureDate){
        return flightCrudRepository.findByOriginAndDestinationAndDepartureDate(origin, destination, departureDate);
    }
    //la respuesta del endpoint debe ser paginada y retornar todos los datos de cada vuelo.
}
