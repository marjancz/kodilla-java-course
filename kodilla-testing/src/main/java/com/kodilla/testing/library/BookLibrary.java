package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
      /**temporary TDD body
       * List<Book> bookList = new ArrayList<Book>();
       * Book book = new Book("The book title", "The book author", 2000);
       * bookList.add(book);
       * LibraryUser libraryUser1 = new LibraryUser("firstName", "lastName", "peselId");
       */
        //body look's after implements tests
        List<Book> bookList = libraryDatabase.listBooksInHandsOf(libraryUser);

        return bookList;
    }
}
