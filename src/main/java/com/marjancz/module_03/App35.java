package com.marjancz.module_03;
import java.util.*;
import java.lang.*;
import java.io.*;

class Volume {
    private String author;
    private String title;
    public Volume(String title, String author) {
        this.author = author;
        this.title = title;
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, author);
    }

    public boolean equals(Object o){
        Volume e = (Volume) o;
        return (title.equals(e.getTitle()) && author.equals(e.getAuthor()));
    }

    public String toString(){
        return "\"" + title + "\"" + ", " + author;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }
}

class YearPublished {
    private int year;
    public YearPublished(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}


class BookListMap {
    private LinkedList<Volume> list = new LinkedList<Volume>();
    private HashMap<Volume, YearPublished> map = new HashMap<Volume, YearPublished>();
    public void createListMap() {

        for(int i = 0; i<500000; i++) {
            Volume volume = new Volume("A , t." + i , "Marian J.");
            YearPublished year = new YearPublished(2017 + i);
            list.add(volume);
            map.put(volume, year);
        }
    }

    public void removeElementList() {

        System.out.println("Quantity of elements in the collection before removing process: " + list.size());

        long removeFirstBegin = System.nanoTime();
        list.remove(0);
        long removeFirstEnd = System.nanoTime();
        System.out.println("Removing first element: " + list.get(0) + " has taken: " + (removeFirstEnd - removeFirstBegin) + "ms");

        long removeLastBegin = System.nanoTime();
        list.remove(list.size() - 1);
        long removeLastEnd = System.nanoTime();

        System.out.println("Removing last element: " + "\"" +list.get(list.size() - 1)+ "\"" + " has taken: " + (removeLastEnd - removeLastBegin) + "ms");
        System.out.println("Quantity of elements in the collection after removing process: " + list.size());

    }

    public void addElementList() {

        System.out.println("\nQuantity of elements in the list collection before adding process: " + list.size());
        long addFirstBegin = System.nanoTime();
        list.add(0, (new Volume("Errata", "MJ")));
        long addFirstEnd = System.nanoTime();
        System.out.println("Adding element at the beginning of the list collection has taken: " + (addFirstEnd - addFirstBegin) + "ms");

        long addLastBegin = System.nanoTime();
        list.add(new Volume("Errata.2", "MJ"));
        long addLastEnd = System.nanoTime();
        System.out.println("Adding element at the end of the list collection has taken: " + (addLastEnd - addLastBegin) + "ms");
        System.out.println("Quantity of elements in the list collection after adding process: " + list.size());
    }

    public void addElementMap() {

        System.out.println("\nQuantity of elements in the map collection before adding process: " + map.size());
        long addBegin = System.nanoTime();
        map.put((new Volume("A, t.234", "Marian J.")), (new YearPublished(20000)));
        long addEnd = System.nanoTime();
        System.out.println("Adding element to the map collection has taken: " + (addEnd - addBegin) + "ns");
        System.out.println("Quantity of elements in the map collection after adding process: " + map.size());
    }

    public void removeElementMap() {

        System.out.println("\nQuantity of elements in the map collection before removing process: " + map.size());
        long removeBegin = System.nanoTime();
        map.remove(new Volume("A, t.234", "Marian J."));
        long removeEnd = System.nanoTime();
        System.out.println("Removing element has taken: " + (removeEnd - removeBegin) + "ns");
        System.out.println("Quantity of elements in the map collection after removing process: " + map.size());
    }

    public void findElementMap() {

        System.out.println("Quantity of elements in the map collection before removing process: " + map.size());
        long findBegin = System.nanoTime();
        map.get(new Volume("A, t.234", "Marian J."));
        long findEnd = System.nanoTime();
        System.out.println("Finding element has taken: " + (findEnd - findBegin) + "ns");
    }
}

class App35 {
    public static void main (String[] args) {

        BookListMap book = new BookListMap();
        System.out.println(" ********** Array List ********** ");
        book.createListMap();
        book.removeElementList();
        book.addElementList();
        System.out.println(" \n********** HashMap ********** ");
        book.findElementMap();
        book.addElementMap();
        book.removeElementMap();
    }
}
