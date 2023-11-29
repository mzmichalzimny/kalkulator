package com.kodilla.good.patterns.challenges;

public class OnlineStoreOrderService implements OrderService {
    @Override
    public boolean order(User user, Product product) {
        System.out.println("Ordering product " + product.getName() + " for user " + user.getName());
        return true;
    }
}