package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class OrderRequest {
    private LocalDateTime orderDate;
    private User user;
    private Commodity commodity;
    private int quantity;

    public OrderRequest(LocalDateTime orderDate, User user, Commodity commodity, int quantity) {
        this.orderDate = orderDate;
        this.user = user;
        this.commodity = commodity;
        this.quantity = quantity;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public User getUser() {
        return user;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "commodity=" + commodity.getName() +
                '}';
    }
}
