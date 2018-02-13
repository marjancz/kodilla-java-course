package com.kodilla.good.patterns.challenges.Allegro;

public class SocketOrderRepository implements OrderRepository{
    OrderRequest orderRequest;

    @Override
    public boolean createRepo(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;

        return false;
    }
}
