package com.kodilla.good.patterns.challenges.Allegro;

public class SocketOrderService implements OrderService {
    OrderRequest orderRequest;

    @Override
    public boolean createOrder(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
        return true;
    }
}
