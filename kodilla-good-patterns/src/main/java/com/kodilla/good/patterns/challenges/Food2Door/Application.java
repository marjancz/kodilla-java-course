package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        ProviderRequestRetriever providerRequestRetriever = new ProviderRequestRetriever();
        ProviderRequest providerRequest = providerRequestRetriever.retrieve();

        ProviderProductOrderService providerProductOrderService = new ProviderProductOrderService(
                new EmailInformationService(),
                new ProviderOrderService(),
                new ProviderRepositoryService());
        providerProductOrderService.execute(providerRequest);
    }
}
