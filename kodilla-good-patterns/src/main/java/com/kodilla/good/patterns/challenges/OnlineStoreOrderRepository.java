package com.kodilla.good.patterns.challenges;

public class OnlineStoreOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Creating order for product " + product.getName() + " for user " + user.getName());
    }
}