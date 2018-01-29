package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String nameOfcontinent;
    private final List<Country> countryList;

    public Continent(String nameOfcontinent, List<Country> countryList) {
        this.nameOfcontinent = nameOfcontinent;
        this.countryList = countryList;
    }

    public String getNameOfcontinent() {
        return nameOfcontinent;
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
