package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jan", "Kowalski");
        Product product = new Product("Table", 1500);
        LocalDateTime orderDate = LocalDateTime.of(2019, 03, 25, 12, 40);

        return new OrderRequest(user, product, orderDate);
    }
}
