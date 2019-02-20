package com.kodilla.exception.test;

public class ThirdChallenge {

    public static void main(String[] args) {
        Flight flight = new Flight("Span", "Warsaw");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight);
        } catch(RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
