package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        ProviderRequestRetriever providerRequestRetriever = new ProviderRequestRetriever();
        ProviderRequest providerRequest = providerRequestRetriever.retrieve();
        ProviderOrderService providerOrderService = new ProviderOrderService();
        providerOrderService.addProvider(new ExtraFoodShop("ExtraFoodShop",
                "ExtraFoodShop@ExtraFoodShop.pl", "123123123"));
//        providerOrderService.addProvider(new HealthyShop("HealthyShop",
//                "HealthyShop@HealthyShop.pl", "987987987"));
//        providerOrderService.addProvider(new GlutenFreeShop("GlutenFreeShop",
//                "GlutenFreeShop@GlutenFreeShop.pl", "123456789"));

        ProviderProductOrderService providerProductOrderService = new ProviderProductOrderService(
                new EmailInformationService(),
                providerOrderService,
                new ProviderRepositoryService());
        providerProductOrderService.execute(providerRequest);
    }
}
