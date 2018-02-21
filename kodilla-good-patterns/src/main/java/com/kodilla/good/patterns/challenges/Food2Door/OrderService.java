package com.kodilla.good.patterns.challenges.Food2Door;

public interface OrderService {
    boolean process(ProviderRequest providerRequest);
    void addProvider(Provider newProvider);
}
