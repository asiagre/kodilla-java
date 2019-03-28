package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private Shop shop;
    private int productNumber;
    private Product product;

    public OrderProcessor(Shop shop, int productNumber, Product product) {
        this.shop = shop;
        this.productNumber = productNumber;
        this.product = product;
    }

    public boolean isOrdered() {
        boolean isSuccessful = shop.process(product, productNumber);
        if(isSuccessful) {
            System.out.println("The ordering status: OK");
            return true;
        }
        return false;
    }
}
