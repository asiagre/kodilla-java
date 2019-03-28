package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Shop {

    @Override
    public boolean process(Product product, double productNumber) {
        System.out.println("Thank you for ordering in Extra-Food-Shop. The total cost is: " + product.getPrize() * productNumber);
        return true;
    }
}
