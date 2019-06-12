package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaDecoratorTestSuite {

    @Test
    public void testPizzaWithTunaAndPepperGetCost() {
        //Given
        Pizza pizza = new PepperPizzaDecorator(new TunaPizzaDecorator(new BasicPizza()));
        //When
        BigDecimal pizzaCost = pizza.getCost();
        //When
        assertEquals(new BigDecimal(21.5), pizzaCost);
    }

    @Test
    public void testPizzaWithTunaAndPepperGetDescription() {
        //Given
        Pizza pizza = new PepperPizzaDecorator(new TunaPizzaDecorator(new BasicPizza()));
        //When
        String description = pizza.getDescription();
        //When
        assertEquals("Pizza with: tomato sauce, cheese, tuna, pepper", description);
    }

    @Test
    public void testPizzaWithSalamiAndExtraCheeseGetCost() {
        //Given
        Pizza pizza = new ExtraCheesePizzaDecorator(new SalamiPizzaDecorator(new BasicPizza()));
        //When
        BigDecimal pizzaCost = pizza.getCost();
        //When
        assertEquals(new BigDecimal(20), pizzaCost);
    }

    @Test
    public void testPizzaWithSalamiAndExtraCheeseGetDescription() {
        //Given
        Pizza pizza = new ExtraCheesePizzaDecorator(new SalamiPizzaDecorator(new BasicPizza()));
        //When
        String description = pizza.getDescription();
        //When
        assertEquals("Pizza with: tomato sauce, cheese, salami, extra cheese", description);
    }

    @Test
    public void testPizzaWithHamAndPineappleGetCost() {
        //Given
        Pizza pizza = new PineapplePizzaDecorator(new HamPizzaDecorator(new BasicPizza()));
        //When
        BigDecimal pizzaCost = pizza.getCost();
        //When
        assertEquals(new BigDecimal(20.0), pizzaCost);
    }

    @Test
    public void testPizzaWithHamAndPineappleGetDescription() {
        //Given
        Pizza pizza = new PineapplePizzaDecorator(new HamPizzaDecorator(new BasicPizza()));
        //When
        String description = pizza.getDescription();
        //When
        assertEquals("Pizza with: tomato sauce, cheese, ham, pineapple", description);
    }

    @Test
    public void testPizzaWithHamAndPepperAndExtraCheeseGetCost() {
        //Given
        Pizza pizza = new ExtraCheesePizzaDecorator(new PepperPizzaDecorator(new HamPizzaDecorator(new BasicPizza())));
        //When
        BigDecimal pizzaCost = pizza.getCost();
        //When
        assertEquals(new BigDecimal(20.5), pizzaCost);
    }

    @Test
    public void testPizzaWithHamAndPepperAndExtraCheeseGetDescription() {
        //Given
        Pizza pizza = new ExtraCheesePizzaDecorator(new PepperPizzaDecorator(new HamPizzaDecorator(new BasicPizza())));
        //When
        String description = pizza.getDescription();
        //When
        assertEquals("Pizza with: tomato sauce, cheese, ham, pepper, extra cheese", description);
    }

}