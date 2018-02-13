package com.kodilla.good.patterns.challenges.Allegro;

public class Commodity {
    private  final String name;
    private  final double price;

    public Commodity(final String name, final double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Commodity: '" + name + '\'';
    }
}
