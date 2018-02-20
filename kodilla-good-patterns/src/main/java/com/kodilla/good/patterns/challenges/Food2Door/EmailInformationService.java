package com.kodilla.good.patterns.challenges.Food2Door;

import com.sun.org.apache.xpath.internal.SourceTree;

public class EmailInformationService implements InformationService {
    @Override
    public void inform(ProviderRequest providerRequest) {
        providerRequest.toString();
        System.out.println("\nfor " + providerRequest.getProvider().toString() +
                "\n" + "\nhas been created!");
    }
}
