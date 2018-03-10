package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        int i = 1;
        String s = "\nLibrary [" + name + "]\n" + "   List of books:";
       for (Book book : books) {
           s = s + "\n" + "      No." + i++ + " " + book.toString();
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedBook = (Library) super.clone();
        clonedBook.books = new HashSet<>();
        for(Book bookList : books) {
            Book clonedList = new Book(bookList.getTitle(), bookList.getAuthor(), bookList.getPublicationDate() );
            clonedBook.getBooks().add(clonedList);
        }
        return clonedBook;
    }
}
