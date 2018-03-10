package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static java.time.LocalDate.of;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Public Library in Radom");
        Book book1 = new Book("Secrets of Alamo", "John Smith", of(2008, 10, 1));
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", of(2012, 12, 1));
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", of(2016, 6, 23));
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", of(2010, 2, 1));
        Book book5 = new Book("World soccer Almanac", "FIFA", of(2000, 1, 1));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library clonedLibrary = null;
        try {
        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Shallow copy of Public Library in Radom");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Deep copy of Public Library in Radom");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book5);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
