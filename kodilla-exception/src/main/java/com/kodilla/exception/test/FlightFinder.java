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

        for(Map.Entry<String, Boolean> entry : flightAvalaible.entrySet()) {
            if(entry.getKey().equals(flight.getArrivalAirport())) {
                count1++;
                if(entry.getValue()) {
                    System.out.println(flight.getArrivalAirport() + " - you can fly to this airport.");
                } else {
                    System.out.println(flight.getArrivalAirport() + " - you cannot fly to this airport.");
                }
            }
            if(entry.getKey().equals(flight.getDepartureAirport())) {
                count2++;
                if(entry.getValue()) {
                    System.out.println(flight.getDepartureAirport() + " - you can fly from this airport.");
                } else {
                    System.out.println(flight.getDepartureAirport() + " - you cannot fly from this airport.");
                }
            }
        }

        if(count1 == 0 || count2 == 0) {
            throw new RouteNotFoundException("We do not have at least one of the entered destination in our offer.");
        }
    }
}
