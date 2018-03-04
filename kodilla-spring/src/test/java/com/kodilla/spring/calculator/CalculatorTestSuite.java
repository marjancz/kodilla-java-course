package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(12, 3 );
        double sub = calculator.sub(5, 3.4);
        double mul = calculator.mul(2.1, 3.6);
        double div = calculator.div(9.9, 3);

        //Then
        Assert.assertEquals(15, add, 0.00001);
        Assert.assertEquals(1.6, sub, 0.00001);
        Assert.assertEquals(7.56, mul, 0.00001);
        Assert.assertEquals(3.3, div, 0.00001);
    }
}
