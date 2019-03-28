package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Shop {

    @Override
    public boolean process(Product product, double productNumber) {
        System.out.println("GLUTEN FREE SHOP!");
        System.out.println("You will not regret your choice!");
        System.out.println("Our products are the best!!!");
        System.out.println("The total cost is: " + product.getPrize() * productNumber);
        return true;
    }
}
