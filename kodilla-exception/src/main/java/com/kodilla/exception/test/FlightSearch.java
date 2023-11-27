package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Lotnisko Chopina", true);
        flights.put("Lotnisko Jana Pawła II", false);

        Boolean isAvailable = flights.get(flight.getArrivalAirport());
        if (isAvailable == null) {
            throw new RouteNotFoundException("Nie znaleziono lotu do: " + flight.getArrivalAirport());
        }

        return isAvailable;
    }
}
