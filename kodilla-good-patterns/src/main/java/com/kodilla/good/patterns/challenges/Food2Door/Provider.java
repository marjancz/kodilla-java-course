package com.kodilla.good.patterns.challenges.Food2Door;

public class Provider {
    private final String name;
    private final String eMail;
    private final String mobile;

    public Provider(final String name, final String eMail, final String mobile) {
        this.name = name;
        this.eMail = eMail;
        this.mobile = mobile;
    }

    public boolean process(ProviderRequest providerRequest) {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return eMail;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "Provider: " +
                "\n name: '" + name + '\'' +
                "\n eMail: '" + eMail + '\'' +
                "\n mobile: '" + mobile + '\'';
    }
}

