package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {

    private ArrayList<Integer> evenNumbers = new ArrayList<>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        Iterator<Integer> even = numbers.iterator();
        while(even.hasNext()) {
            int n = even.next();
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        return evenNumbers;
    }
}
