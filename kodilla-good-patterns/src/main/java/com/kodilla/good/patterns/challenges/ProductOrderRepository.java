package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime orderTime) {
        System.out.println("The order has been created.");
        // ...
        return true;
    }
}
