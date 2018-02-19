package com.kodilla.good.patterns.challenges.Food2Door;

public class EmailInformationService implements InformationService {
    @Override
    public void inform(ProviderRequest providerRequest) {
        System.out.println("The order: \n" +
                "\n"  + providerRequest.getOrderList() +
                "\nfor " + providerRequest.getProvider().toString() +
                "\n" + "\nhas been created!");
    }
}
