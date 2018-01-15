package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain62 {
    public static void main(String[] args) {
        Calculator cal = new Calculator(655, 345);
        int sum = cal.sum();
        int subs = cal.substract();
        int a = cal.getA();
        int b = cal.getB();

        if ((sum == 1000) && (subs == 310)) {
            System.out.println("Test of calculator is OK.!");
        } else {
            System.out.println("Error!!!");
        }
    }
}