package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public static List<ForumUser> getUserList() {
        final List<ForumUser> theList = new ArrayList<>();
        theList.add(new ForumUser(1, "John Smith", 'M',
                LocalDate.of(1992,2,24), 2 ));
        theList.add(new ForumUser(2, "John Wolkowitz", 'M',
                LocalDate.of(1995,5,15), 15));
        theList.add(new ForumUser(3,"Dorothy Newman", 'F',
                LocalDate.of(1980,11,11), 5));
        theList.add(new ForumUser(4, "Martin Valenzuela", 'M',
                LocalDate.of(1982,8,13), 123));
        theList.add(new ForumUser(5,"Lucy Riley", 'F',
                LocalDate.of(1977,3,30), 33));
        theList.add(new ForumUser(6, "Owen Rogers", 'M',
                LocalDate.of(1999,4,28), 14));
        theList.add(new ForumUser(7, "Matilda Davies", 'F',
                LocalDate.of(2002,7,9), 99));
        theList.add(new ForumUser(8, "Declan Booth", 'M',
                LocalDate.of(1993,12,24), 0));
        theList.add(new ForumUser(9, "Corinne Foster", 'F',
                LocalDate.of(1965,8,16), 1));
        theList.add(new ForumUser(10, "Khloe fry", 'F',
                LocalDate.of(1987,11,1), 43));

        return new ArrayList<>(theList);
    }
}
