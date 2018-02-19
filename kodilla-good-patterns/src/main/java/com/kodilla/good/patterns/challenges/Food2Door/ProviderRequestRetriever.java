package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class ProviderRequestRetriever {

    public ProviderRequest retrieve() {

        LocalDateTime orderDate = LocalDateTime.of(2018, 2, 10, 12, 0);

        Provider extraFoodShop = new Provider("ExtraFoodShop",
                            "ExtraFoodShop@ExtraFoodShop.pl", "123123123");
//        Provider healthyShop = new Provider("HealthyShop", "HealthyShop@HealthyShop.pl",
//                            "987987987");
//        Provider glutenFreeShop = new Provider("GlutenFreeShop", "GlutenFreeShop@GlutenFreeShop.pl",
//                            "123456789");

        List<Product> extraFoodShopList = Arrays.asList(new Product("Milk", 2.09,
                        50), new Product("Eggs", 150, 0.80));
//        List<Product> healtyShopList = Arrays.asList(new Product("Rye Bread", 30,
//                2.85), new Product("Corn bread", 20, 1.19));
//        List<Product> glutenFreeShopList = Arrays.asList(new Product("Rye Bread", 30,
//                2.85), new Product("Corn bread", 20, 1.19));

        return new ProviderRequest(orderDate, extraFoodShop, extraFoodShopList);
    }
}
