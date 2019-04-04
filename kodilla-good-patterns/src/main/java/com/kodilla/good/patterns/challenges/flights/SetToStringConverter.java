package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class SetToStringConverter {

    public static String convertSetToString(Set<Flight> flightSet) {
        String resultOfSearching = "";
        for(Flight flight : flightSet) {
            resultOfSearching += (flight + "\n");
        }

        return resultOfSearching;
    }
}
