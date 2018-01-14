package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain62 {
    public static void main(String[] args) {
        Calculator cal = new Calculator(345, 467);
        int sum = cal.sum();
        int subs = cal.substract();
        int a = cal.getA();
        int b = cal.getB();
        int rightA = 1000 - b;
        int rightB = 1000 - a;

        if (sum < 1000) {
            System.out.println("Test of sum is OK.!");
        } else {
            System.out.println("Error!!! Set \"a\" higher than: [" + rightA + "] or set \"b\" higher than: [" + rightB + "]");
        }

        if (subs > 0) {
            System.out.println("Test of substract is OK.!");
        } else {
            System.out.println("Error!!! Set \"b\" lower than: [" + a + "]");
        }
    }
}