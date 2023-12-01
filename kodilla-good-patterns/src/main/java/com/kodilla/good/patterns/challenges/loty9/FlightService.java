package com.kodilla.good.patterns.challenges.loty9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class FlightService {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> findFlightsFrom(String from) {
        return flights.stream()
                .filter(flight -> flight.getFrom().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String to) {
        return flights.stream()
                .filter(flight -> flight.getTo().equals(to))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsVia(String from, String via, String to) {
        return flights.stream()
                .filter(flight -> flight.getFrom().equals(from) && flight.getTo().equals(via))
                .collect(Collectors.toList());
    }
}