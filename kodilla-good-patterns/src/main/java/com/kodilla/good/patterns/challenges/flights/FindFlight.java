package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FindFlight {
    private FlightsDatabase flightsDatabase;

    public FindFlight(FlightsDatabase flightsDatabase) {
        this.flightsDatabase = flightsDatabase;
    }

    public Set<Flight> findFlightFrom(String departure) {
        Set<Flight> results = flightsDatabase.getFlights().stream()
                .filter(dep -> dep.getDeparture().equalsIgnoreCase(departure))
                .collect(Collectors.toSet());

        return results;
    }

    public Set<Flight> findFlightTo(String arrival) {
        Set<Flight> results = flightsDatabase.getFlights().stream()
                .filter(ar -> ar.getArrival().equalsIgnoreCase(arrival))
                .collect(Collectors.toSet());

        return results;
    }

    public Set<Flight> findFlightThrow(String cityThrow) {
        Set<Flight> results = flightsDatabase.getFlights().stream()
                .filter(ar -> (ar.getDeparture().equalsIgnoreCase(cityThrow) || ar.getArrival().equalsIgnoreCase(cityThrow)))
                .collect(Collectors.toSet());

        return results;
    }
}
