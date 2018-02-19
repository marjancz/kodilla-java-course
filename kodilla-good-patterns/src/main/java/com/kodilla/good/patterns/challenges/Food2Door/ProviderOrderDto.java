package com.kodilla.good.patterns.challenges.Food2Door;

public class ProviderOrderDto {
    public Provider provider;
    public boolean isOrdered;

    public ProviderOrderDto(Provider provider, boolean isOrdered) {
        this.provider = provider;
        this.isOrdered = isOrdered;
    }

    public Provider getProvider() {
        return provider;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
