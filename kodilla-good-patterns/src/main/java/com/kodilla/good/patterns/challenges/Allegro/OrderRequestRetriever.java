package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        LocalDateTime orderDate = LocalDateTime.of(2018, 2, 10, 12, 0);

        User user = new User("Mariusz", "Janczyk",
                "mariusz@janczyk.com.pl", "+48 530 864 548");

        Commodity commodity = new Commodity("sockets", 4.15);
        int quantity = 5;

        return new OrderRequest(orderDate, user, commodity, quantity);
    }
}
