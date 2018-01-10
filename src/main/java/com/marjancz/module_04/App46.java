package com.marjancz.module_04;
import java.util.*;
import java.lang.*;
import java.io.*;

class Calculator {
    private double numA;
    private double numB;
    private double result;

    public Calculator(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
        this.result = result;
    }

    public void sum() {
        result = numA + numB;
        System.out.println("Result of sum: " + result);
    }

    public  void substract() {
        result = numA - numB;
        System.out.println("Result of substract: " + result);;
    }

    public double getNumA() {
        return numA;
    }

    public double getNumB() {
        return numB;
    }

    public String toString() {
        return "We have two numbers: " + "(" + numA + ") and (" + getNumB() + ")";
    }
}

class App46 {

    public static void main(String[] args) {

        Calculator cal = new Calculator(345.33, 467.45);
        System.out.println(cal.toString());
        cal.sum();
        cal.substract();
    }
}
