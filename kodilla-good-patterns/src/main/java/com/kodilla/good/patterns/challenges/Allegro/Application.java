package com.kodilla.good.patterns.challenges.Allegro;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new EmailInformationService(),
                new SocketOrderService(),
                new SocketOrderRepository());
        productOrderService.process(orderRequest);
    }
}
