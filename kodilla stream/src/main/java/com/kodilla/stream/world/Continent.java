package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;

    private final List<Country> countryList = new ArrayList<Country>();

    public Continent(final String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return name.equals(continent.name);
    }

    @Override
    public int hashCode() {
        return name.length();
    }
}
