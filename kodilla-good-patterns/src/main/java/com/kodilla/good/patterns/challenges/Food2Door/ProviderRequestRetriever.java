package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProviderRequestRetriever {

    public ProviderRequest retrieve() {

        LocalDateTime orderDate = LocalDateTime.of(2018, 2, 10, 12, 0);

        Provider extraFoodShop = new ExtraFoodShop("ExtraFoodShop",
                            "ExtraFoodShop@ExtraFoodShop.pl", "123123123");
//        Provider healthyShop = new Provider("HealthyShop", "HealthyShop@HealthyShop.pl",
//                            "987987987");
//        Provider glutenFreeShop = new Provider("GlutenFreeShop", "GlutenFreeShop@GlutenFreeShop.pl",
//                            "123456789");

        List<Product> extraFoodShopList = Arrays.asList(new Product("Milk", 2.09,
                        50), new Product("Eggs", 0.80, 150));
//        List<Product> healtyShopList = Arrays.asList(new Product("Rye Bread", 30,
//                2.85), new Product("Corn bread", 20, 1.19));
//        List<Product> glutenFreeShopList = Arrays.asList(new Product("Gluten-free flour",
//                40, 3.25), new Product("Gluten-free milk", 30, 2.79));

        return new ProviderRequest(orderDate, extraFoodShop, extraFoodShopList);
    }
}
