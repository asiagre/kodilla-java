package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinents = new ArrayList<Continent>();

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public void addContinent(Continent continent) {
        listOfContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
