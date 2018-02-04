package com.kodilla.exception.test;

import com.sun.org.apache.xpath.internal.SourceTree;

public class FirstChallenge {
    private double a;
    private double b;

    public double divide(double a, double b) throws ArithmeticException {
        this.a = a;
        this.b = b;

        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double a = 3;
        double b = 2;

        try {
            double result = firstChallenge.divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Error! Cannot divide by zero!");
        } finally {
            System.out.println("End of dividing process!");
        }
    }
}