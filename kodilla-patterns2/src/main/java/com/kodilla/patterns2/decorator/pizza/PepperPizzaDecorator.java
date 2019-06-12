package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperPizzaDecorator extends AbstractPizzaDecorator {
    public PepperPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pepper";
    }
}
