package com.kodilla.good.patterns.challenges.Allegro;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();


        ProductOrderService productOrderService = new ProductOrderService(
                new EmailInformationService(),
                        //.inform(orderRequest),
                new SocketOrderService(),
                        //.createOrder(orderRequest),
                new SocketOrderRepository());
                        //.createRepo(orderRequest));
        productOrderService.process(orderRequest);
    }
}
