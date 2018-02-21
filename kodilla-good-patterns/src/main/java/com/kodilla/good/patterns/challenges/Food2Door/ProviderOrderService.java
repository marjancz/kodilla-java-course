package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProviderOrderService implements OrderService {
    private List<Provider> providerList = new ArrayList<>();


    @Override
    public boolean process(ProviderRequest providerRequest) {
        for(Provider provider: providerList) {
            if(provider.getName().equals(providerRequest.getProvider().getName())) {

                return provider.process(providerRequest);
            }
        }
        return false;
    }

    @Override
    public void addProvider(Provider newProvider) {
        providerList.add(newProvider);
    }
}
