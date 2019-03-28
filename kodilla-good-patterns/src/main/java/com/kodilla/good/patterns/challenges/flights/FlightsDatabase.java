package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsDatabase {
    private Set<Flight> flights;

    public FlightsDatabase() {
        flights = new HashSet<>();
        flights.add(new Flight("Cracow", "Warsaw"));
        flights.add(new Flight("Cracow", "London"));
        flights.add(new Flight("London", "Breslau"));
        flights.add(new Flight("Breslau", "Warsaw"));
        flights.add(new Flight("London", "Berlin"));
        flights.add(new Flight("Berlin", "Warsaw"));
        flights.add(new Flight("Cracow", "Breslau"));
        flights.add(new Flight("Paris", "Warsaw"));
    }

    public boolean addFlight(Flight flight) {
        flights.add(flight);
        return true;
    }

    public boolean removeFlight(Flight flight) {
        flights.remove(flight);
        return true;
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
