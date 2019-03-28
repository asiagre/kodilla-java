package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        Product product1 = new Product("Milk", 2.5);
        Product product2 = new Product("Yogurt", 1.5);
        Product product3 = new Product("Apple juice", 3.0);

        OrderProcessor orderProcessor1 = new OrderProcessor(new ExtraFoodShop(), 6, product1);
        OrderProcessor orderProcessor2 = new OrderProcessor(new HealthyShop(), 4, product2);
        OrderProcessor orderProcessor3 = new OrderProcessor(new GlutenFreeShop(), 7, product3);

        boolean orderStatus1 = orderProcessor1.isOrdered();
        System.out.println();
        boolean orderStatus2 = orderProcessor2.isOrdered();
        System.out.println();
        boolean orderStatus3 = orderProcessor3.isOrdered();

    }

}
