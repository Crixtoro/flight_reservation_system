package com.example.flight_reservation_system.persistence;

import com.example.flight_reservation_system.persistence.crud.FlightCrudRepository;
import com.example.flight_reservation_system.persistence.entity.Flight;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/*Con la anotación @Repository le indicamos a Spring que esta clase es la encargada de interactuar
con la base de datos*/
/**
 * Este repositorio proporciona acceso a todos los datos de la tabla "Flight" en la base de datos.
 *
 * @author [Ana Vasquez, Luisa Guaqueta, Christian Toro]
 * @version 1.0
 */
@Repository
public class FlightRepository {
    private FlightCrudRepository flightCrudRepository;

    /*Creamos un método que recupere una lista con todos los vuelos que tenemos en nuestra base de datos,
    utilizamos el CrudRepository ya que es una consulta sencilla
     */

    /**
     * Encuentra todos los componentes de la tabla
     * @return una lista de todos los vuelos
     */
    public List<Flight> getAll() {
        return (List<Flight>) flightCrudRepository.findAll();
    }

    /**
     * Crea un vuelo
     * @param flight el objeto con la infomación del nuevo vuelo
     * @return el vuelo creado
     */
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

    /**
     * Consulta un vuelo por si id
     *
     * @param codeFlight id del vuelo
     * @return optional con la información del vuelo
     */
    public Optional<Flight> detailFlight(String codeFlight) {
        return flightCrudRepository.findById(codeFlight);
    }

    /**
     * Elimina un vuelo por su código
     * @param codeFlight código del vuelo a eliminar
     */
    public void delete(String codeFlight) {
        flightCrudRepository.deleteById(codeFlight);
    }

    /**
     * Actualiza la información de un vuelo
     * @param codeFlight código del vuelo a actualizar
     * @param updatedFlight datos actualizados
     * @return objeto actualizado
     */
    public Flight updateFlight(String codeFlight, Flight updatedFlight) {
        if (flightCrudRepository.existsById(codeFlight)) {
            updatedFlight.setCodeFlight(codeFlight);
            return flightCrudRepository.save(updatedFlight);
        } else {
            return null; //Definir manejo de excepciones
        }
    }

    /**
     * Consulta personalizada donde buscamos un vuelo por su origen, destino y fecha de salida
     * @param origin origen del vuelo
     * @param destination destino del vuelo
     * @param departureDate fecha de salida
     * @return lista de vuelos que cumplen con la consulta
     */
    public Optional<List<Flight>> getFlightByCriteria(String origin, String destination, LocalDateTime departureDate){
        return Optional.ofNullable(flightCrudRepository.findByOriginAndDestinationAndDepartureDate(origin, destination, departureDate));
    }
    //la respuesta del endpoint debe ser paginada y retornar todos los datos de cada vuelo.

    /**
     *
     * @return
     */
    public List<Flight> findStopover(){
        return flightCrudRepository.findByStopover(true);
    }
}
