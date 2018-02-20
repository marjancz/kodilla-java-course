package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ProviderRequest {
    private final LocalDateTime orderDate;
    public Provider provider;
    List<Product> orderList;

        public ProviderRequest(LocalDateTime orderDate, Provider provider,
                           List<Product> orderList) {
        this.orderDate = orderDate;
        this.provider = provider;
        this.orderList = orderList;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Provider getProvider() {
        return provider;
    }
    public List<Product> getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        System.out.println("Product order list:\n");
        for (Product product : orderList) {
            System.out.println(product);
        }
        return "";
    }
}
