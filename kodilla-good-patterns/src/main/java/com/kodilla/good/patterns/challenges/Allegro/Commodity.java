package com.kodilla.good.patterns.challenges.Allegro;

public class Commodity {
    private  String name;
    private  double price;

    public Commodity(String name, double price) {
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
        return "Commodity{" +
                "name='" + name + '\'' +
                '}';
    }
}
