package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Shop {
    @Override
    public boolean process(Product product, double productNumber) {
        System.out.println("Your order has been register in Healthy Shop.");
        System.out.println("The total cost is: " + product.getPrize() * productNumber);
        return true;
    }
}
