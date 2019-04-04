package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        int count1 = 0, count2 = 0;
        Map<String, Boolean> flightAvalaible = new HashMap<String, Boolean>();

        flightAvalaible.put("London", true);
        flightAvalaible.put("Krakow", true);
        flightAvalaible.put("Warsaw", true);
        flightAvalaible.put("Paris", false);

        if (flightAvalaible.get(flight.getDepartureAirport()) == null || flightAvalaible.get(flight.getArrivalAirport()) == null) {
            throw new RouteNotFoundException("Error: wrong city.");
        } else {
            if (flightAvalaible.get(flight.getArrivalAirport()) && flightAvalaible.get(flight.getDepartureAirport())) {
                System.out.println("This flight is in our offer.");
            } else {
                System.out.println("We do not offer this flight.");
            }
        }
    }
}
