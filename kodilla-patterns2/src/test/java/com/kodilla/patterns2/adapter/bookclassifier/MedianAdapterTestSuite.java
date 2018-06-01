package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter adapter = new MedianAdapter();

        bookSet.add(new Book("Author1", "Title1", 1943, "0001"));
        bookSet.add(new Book("Author2", "Title2", 1955, "0002"));
        bookSet.add(new Book("Author3", "Title3", 1905, "0003"));
        bookSet.add(new Book("Author4", "Title4", 2018, "0004"));
        bookSet.add(new Book("Author5", "Title5", 2001, "0005"));
        bookSet.add(new Book("Author6", "Title6", 1999, "0006"));
        bookSet.add(new Book("Author7", "Title7", 2010, "0007"));
        bookSet.add(new Book("Author8", "Title8", 2005, "0008"));
        bookSet.add(new Book("Author9", "Title9", 1977, "0009"));
        bookSet.add(new Book("Author10", "Title10", 1965, "00010"));

        //When
        int mediana = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1988, mediana);
    }
}