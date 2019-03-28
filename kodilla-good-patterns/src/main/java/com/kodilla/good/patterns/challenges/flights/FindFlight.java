package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FindFlight {

    public Set<Flight> findFlightFrom(FlightsDatabase flightsDatabase, String departure) {
        Set<Flight> results = flightsDatabase.getFlights().stream()
                .filter(dep -> dep.getDeparture().equalsIgnoreCase(departure))
                .collect(Collectors.toSet());

        return results;
    }

    public Set<Flight> findFlightTo(FlightsDatabase flightsDatabase, String arrival) {
        Set<Flight> results = flightsDatabase.getFlights().stream()
                .filter(ar -> ar.getArrival().equalsIgnoreCase(arrival))
                .collect(Collectors.toSet());

        return results;
    }

    public Set<Flight> findFlightThrow(FlightsDatabase flightsDatabase, String cityThrow) {
        Set<Flight> results = flightsDatabase.getFlights().stream()
                .filter(ar -> (ar.getDeparture().equalsIgnoreCase(cityThrow) || ar.getArrival().equalsIgnoreCase(cityThrow)))
                .collect(Collectors.toSet());

        return results;
    }
}
