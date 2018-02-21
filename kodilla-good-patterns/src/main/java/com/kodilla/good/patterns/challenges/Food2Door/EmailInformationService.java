package com.kodilla.good.patterns.challenges.Food2Door;

public class EmailInformationService implements InformationService {
    @Override
    public void inform(ProviderRequest providerRequest) {
        providerRequest.toString();
        System.out.println("\nhas been created!");
    }
}
