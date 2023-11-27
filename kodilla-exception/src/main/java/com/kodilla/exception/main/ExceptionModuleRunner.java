package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearch;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
   // kod z poprzedniego zadania      FileReader fileReader = new FileReader();

    //    try {
    //        fileReader.readFile("names.txt");
   //     } catch (FileReaderException e) {
    //        System.out.println("Problem while reading a file!");
   //     }
  //  }

        // main do zadania 8.4
        Flight flight = new Flight("Lotnisko Chopina", "Lotnisko Jana Pawła II");
        FlightSearch flightSearch = new FlightSearch();

        try {
            boolean isFlightAvailable = flightSearch.findFlight(flight);
            System.out.println("Czy lot jest dostępny? " + isFlightAvailable);
        } catch (RouteNotFoundException e) {
            System.out.println("Problem z wyszukiwaniem lotu " + e.getMessage());
        }
    }
}
// koniec main do zadania 8.4