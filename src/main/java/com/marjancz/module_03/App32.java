package com.marjancz.module_03;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Books{
    private String title;
    private String author;
    private int year;

    public Books(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString(){
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}

class Order{
    private Books book;
    private LocalDate dateOfOrder;

    public Order(Books book, int year, int month, int day){
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    public String toString(){
        return "Order created: " + dateOfOrder + "\n" +
                " ordered book: " + book;

    }

    public Books getBook(){
        return book;
    }

    public LocalDate getDateOfOrder(){
        return dateOfOrder;
    }
}

class StackRemover {
    private ArrayDeque<Order> theOrders;
    private Order temporaryOrder;
    public StackRemover(ArrayDeque<Order> theOrders) {
        this.theOrders = theOrders;
    }

    public void stackRemover() {
        int size = theOrders.size();
        for(int i = 0; i<size; i++) {
            temporaryOrder = theOrders.pop();
        }
    }

    public void showQueue() {
        System.out.println("Queue is emptied. It's size: " + theOrders.size());
        System.out.println();
        System.out.println("Last order taken from queue was:\n" + temporaryOrder);
        System.out.println();
    }
}

class OrdersQueue {
    public static void main (String[] args) throws java.lang.Exception {

        Books theBook1 = new Books("Assassins' Creed the Book", "William Shakespeare", 2016);
        Books theBook2 = new Books("Book of jungle", "Rudyard Kipling", 1894);
        Books theBook3 = new Books("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);

        Order theOrder1 = new Order(theBook1, 2017, 6, 28);
        Order theOrder2 = new Order(theBook2, 2017, 6, 29);
        Order theOrder3 = new Order(theBook1, 2017, 6, 30);
        Order theOrder4 = new Order(theBook2, 2017, 7, 01);
        Order theOrder5 = new Order(theBook1, 2017, 7, 02);

        ArrayDeque<Order> theOrders = new ArrayDeque<Order>();
        System.out.println("Queue is created. It's size: " + theOrders.size());

        theOrders.push(theOrder1);
        theOrders.push(theOrder2);
        theOrders.push(theOrder3);
        theOrders.push(theOrder4);
        theOrders.push(theOrder5);

        System.out.println("Queue is filled. It's size: " + theOrders.size());
        System.out.println();
        System.out.println("First order in the queue is: \n" + theOrders.peek());
        System.out.println();

        StackRemover order1 = new StackRemover(theOrders);

        order1.stackRemover();
        order1.showQueue();
    }
}
