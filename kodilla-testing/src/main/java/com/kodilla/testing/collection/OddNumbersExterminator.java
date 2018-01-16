package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> listNumbers = new ArrayList<>();
    ArrayList<Integer> evenNumbers = new ArrayList<>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
    //    ArrayList<Integer> listNumbers = new ArrayList<>();
        for(Integer n: listNumbers) {
          //  int num = numbers.get(i);
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        return numbers;
    }
}
