package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        FlightsDatabase flightsDatabase = new FlightsDatabase();

        FindFlight findFlight = new FindFlight(flightsDatabase);

        System.out.println("Flights from Cracow: ");
        System.out.println(SetToStringConverter.convertSetToString(findFlight.findFlightFrom("Cracow")));
        System.out.println("Flights to Warsaw: ");
        System.out.println(SetToStringConverter.convertSetToString(findFlight.findFlightTo("Warsaw")));
        System.out.println("Flights throw London: ");
        System.out.println(SetToStringConverter.convertSetToString(findFlight.findFlightThrow("London")));

    }
}
