package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;
    private int result;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public int sum() {
        int resultSum = a + b;
        return resultSum;
    }

    public int substract() {
        int resultSubstract = a - b;
        return resultSubstract;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
