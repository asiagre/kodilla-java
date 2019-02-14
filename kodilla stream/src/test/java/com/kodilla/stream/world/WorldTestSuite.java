package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country egypt = new Country("Egypt", new BigDecimal("1000000000"));
        Country ethiopia = new Country("Ethiopia", new BigDecimal("1000000000"));
        Country algieria = new Country("Algieria", new BigDecimal("1000000000"));
        Country kenya = new Country("Kenya", new BigDecimal("1000000000"));
        Country china = new Country("China", new BigDecimal("1000000000"));
        Country pakistan = new Country("Pakistan", new BigDecimal("1000000000"));
        Country russia = new Country("Russia", new BigDecimal("1000000000"));
        Country india = new Country("India", new BigDecimal("1000000000"));
        Country usa = new Country("USA", new BigDecimal("1000000000"));
        Country mexico = new Country("Mexico", new BigDecimal("1000000000"));
        Country canada = new Country("Canada", new BigDecimal("1000000000"));
        Country cuba = new Country("Cuba", new BigDecimal("1000000000"));
        Country spain = new Country("Spain", new BigDecimal("1000000000"));
        Country germany = new Country("Germany", new BigDecimal("1000000000"));
        Country poland = new Country("Poland", new BigDecimal("1000000000"));
        Country france = new Country("France", new BigDecimal("1000000000"));

        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");
        Continent europe = new Continent("Europe");

        africa.addCountry(egypt);
        africa.addCountry(ethiopia);
        africa.addCountry(kenya);
        africa.addCountry(algieria);
        asia.addCountry(india);
        asia.addCountry(pakistan);
        asia.addCountry(russia);
        asia.addCountry(china);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(cuba);
        europe.addCountry(spain);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(poland);

        World world = new World();

        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        world.addContinent(europe);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("16000000000"), result);
    }

}
