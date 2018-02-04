package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 2.5;
        double y = 1.5;
        try {
            secondChallenge.probablyIWillThrowException(x, y);
        } catch (Exception e) {
            System.out.println("Error! Variable \"x\" has to be range <1, 2) or " +
                    "variable \"y\" has to be different from 1.5!");
        } finally {
            System.out.println("End exception!");
        }
    }
}
