package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private String name;
    private double prize;

    public Product(String name, double prize) {
        this.name = name;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public double getPrize() {
        return prize;
    }
}
