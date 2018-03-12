package com.kodilla.patterns.strategy.social;

public class Millenilas extends User {
    public Millenilas(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
