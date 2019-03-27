package com.kodilla.good.patterns.challenges;

public class OrderDTO {

    private User user;
    private boolean isOrder;

    public OrderDTO(User user, boolean isOrder) {
        this.user = user;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
