package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public  void testGetAverage() {
        //Then
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double sum = IntStream.range(0, numbers.length)
                    .map(n -> n=numbers[n])
                    .sum();
        //            .average();
        double ave = sum/numbers.length;

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(ave, result, 0);
    }
}
