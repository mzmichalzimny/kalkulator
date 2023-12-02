package com.kodilla.good.patterns.challenges.loty9;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightServiceTest {
    @Test
    void testFindFlightsFrom() {
        //Given
        FlightService flightService = new FlightService();
        flightService.addFlight(new Flight("Warszawa", "Katowice"));
        flightService.addFlight(new Flight("Warszawa", "Wrocław"));

        //When
        List<Flight> flightsFromWarsaw = flightService.findFlightsFrom("Warszawa");

        //Then
        assertEquals(2, flightsFromWarsaw.size());
    }

    @Test
    void testFindFlightsTo() {
        //Given
        FlightService flightService = new FlightService();
        flightService.addFlight(new Flight("Warszawa", "Kraków"));
        flightService.addFlight(new Flight("Wrocław", "Kraków"));

        //When
        List<Flight> flightsToKrakow = flightService.findFlightsTo("Kraków");

        //Then
        assertEquals(2, flightsToKrakow.size());
    }

    @Test
    void testFindFlightsVia() {
        //Given
        FlightService flightService = new FlightService();
        flightService.addFlight(new Flight("Wrocław", "Katowice"));
        flightService.addFlight(new Flight("Katowice", "Kraków"));

        //When
        List<Flight> flightsViaWroclaw = flightService.findFlightsVia("Wrocław", "Katowice", "Kraków");

        //Then
        assertEquals(1, flightsViaWroclaw.size());
    }
}