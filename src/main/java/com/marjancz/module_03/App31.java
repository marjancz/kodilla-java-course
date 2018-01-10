package com.marjancz.module_03;
import java.util.*;
import java.lang.*;

/* Class Employee represents an employee in the company */
class Book {
    private String author;
    private String title;
    private int year;

    // Constructor
    public Book(String author, String title, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int hashCode(){
        return Objects.hash(year);
    }

    public boolean equals(Object o){
        Book e = (Book) o;
        return (title.equals(e.getTitle())) && (author.equals(e.getAuthor())) &&
                (year == (e.getYear()));
    }

    public String toString(){
        return "\"" + title + "\"" + ", " + author + ", (" + year + ")";
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}

class App31 {

    public static void main (String[] args) throws java.lang.Exception
    {

        Book book1 = new Book("Aaa Bbb", "Cienki Bolek", 1987);
        Book book2 = new Book("Ccccc Dddddd", "Gruby Bolek", 2011);
        Book book3 = new Book("Eeeeeee Ffffffffff", "Lolek i Bolek", 1977);
        Book book4 = new Book("Steven King ", "Green Mile", 1967);
        Book book5 = new Book("G.G.Hhhhh", "Blair Witch", 1992);

        HashSet<Book> booker = new HashSet<Book>();
        booker.add(book1);
        booker.add(book2);
        booker.add(book3);
        booker.add(book4);
        booker.add(book5);

        System.out.println("Books which have been published before Year 2010 are: ");

        for(Book theBook: booker){
            if(theBook.getYear() < 2010){
                System.out.println(theBook);
            }
        }
    }
}

