package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        FlightsDatabase flightsDatabase = new FlightsDatabase();

        FindFlight findFlight = new FindFlight();

        System.out.println("Flights from Cracow: ");
        System.out.println(SetToStringConverter.convertSetToString(findFlight.findFlightFrom(flightsDatabase, "Cracow")));
        System.out.println("Flights to Warsaw: ");
        System.out.println(SetToStringConverter.convertSetToString(findFlight.findFlightTo(flightsDatabase, "Warsaw")));
        System.out.println("Flights throw London: ");
        System.out.println(SetToStringConverter.convertSetToString(findFlight.findFlightThrow(flightsDatabase, "London")));

    }
}
