package com.kodilla.exception.test;

public class SecondChallenge {
    private double x;
    private double y;
    public String probablyIWillThrowException(double x, double y) throws Exception {
        this.x = x;
        this.y = y;

        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }
}
