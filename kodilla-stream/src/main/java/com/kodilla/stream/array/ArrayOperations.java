package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n-> n=numbers[n])
                .forEach(System.out::println);
        double average = IntStream.range(0, numbers.length)
                    .map(n -> n=numbers[n])
                    .average()
                    .orElse(Double.NaN);
        return average;
    }
}
