package com.marjancz.module_02;

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayListEvaluationIT {

    public List<Integer> createEvaluationList() {
        ArrayList <Integer> evaluation = new ArrayList<Integer>();

        evaluation.add(4);
        evaluation.add(4);
        evaluation.add(3);
        evaluation.add(5);
        evaluation.add(5);
        evaluation.add(2);
        evaluation.add(4);
        evaluation.add(6);
        evaluation.add(5);
        evaluation.add(6);

        return evaluation;
    }

    public int getMax()	{
        int max = 1;
        List<Integer> evaluation = createEvaluationList();

        for (int i = 0; i < evaluation.size(); i++) {
            if (evaluation.get(i) > max) {
                max = evaluation.get(i);
            }
        }
        return max;
    }

    public int getMin() {
        int min = 6;
        List<Integer> evaluation = createEvaluationList();

        for (int i = 0; i < evaluation.size(); i++)	{
            if (evaluation.get(i) < min) {
                min = evaluation.get(i);
            }
        }
        return min;
    }

    public double getAverage()	{
        double sum = 0;
        int lowHi = getMin() + getMax();
        List<Integer> evaluation = createEvaluationList();

        for(int i=0; i< evaluation.size(); i++) {
            sum = sum + evaluation.get(i);
        }

        double average = (sum - lowHi) / (evaluation.size() - 2);
        System.out.println("Average evaluation of IT subject is: " + average);
        System.out.println("To calculation of average rejected highest: \"" + getMax() + "\"" + " and lowest: \"" +getMin() + "\" evaluations.");
        return average;
    }
}

class MyBook {

    private String title;
    private int year;
    MyBook(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return "\"" + this.title + "\"" + " " + this.year;
    }
}

class BookLinkedList {
    private LinkedList<MyBook> list = new LinkedList<MyBook>();

    public void createCollection()	{
        list.add(new MyBook("AAA", 1987));
        list.add(new MyBook("BBB", 2001));
        list.add(new MyBook("CCC", 2014));
        list.add(new MyBook("DDD", 2000));
        list.add(new MyBook("EEE", 1965));
        list.add(new MyBook("FFF", 2016));
        list.add(new MyBook("GGG", 1994));
        list.add(new MyBook("HHH", 2011));
        list.add(new MyBook("III", 2009));
        list.add(new MyBook("JJJ", 1977));
    }

    public void showBookLessThan2k() {
        for(MyBook book: list)	{
            if(book.getYear() >= 2000) {
                System.out.println(book.toString());
            }
        }
    }
}

class App25 {

    public static void main(String[] args) throws java.lang.Exception {

        ArrayListEvaluationIT arrayListEvaluationIT = new ArrayListEvaluationIT();
        BookLinkedList bookLinkedList = new BookLinkedList();
        System.out.println("___*** This is Part 1 of the task ***___");
        arrayListEvaluationIT.getAverage();
        bookLinkedList.createCollection();
        System.out.println("___*** End of Part 1 ***___");
        System.out.println("");
        System.out.println("___*** This is Part 2 of the task ***___");
        System.out.println("List of books which have been published after year 2000:");
        bookLinkedList.showBookLessThan2k();
        System.out.println("___*** End of Part 2 ***___");
    }
}
