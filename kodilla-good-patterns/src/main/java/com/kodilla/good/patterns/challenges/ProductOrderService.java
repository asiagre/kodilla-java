package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{

    @Override
    public boolean order(User user, Product product, LocalDateTime orderTime) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " has ordered "
                + product.getName() + " for " + product.getCost() + " at " + orderTime.toString());
        return true;
    }
}
