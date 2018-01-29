package com.kodilla.stream;

//import com.kodilla.stream.book.Book;
//import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
//import com.kodilla.stream.person.People;

//import java.util.List;
//import java.util.Map;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        //an example
//        People.getList().stream()
//                .map(s -> s.toUpperCase())
//                .filter(s -> s.length()>11)
//                .map(s -> s.substring(0, s.indexOf(' ')+ 2) + ".")
//                .filter(s -> s.substring(0,1).equals("M"))
//                .forEach(System.out::println);

//        //an example
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//        //an example of collector of list collection
//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);

//        //an example collector of map collection
//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//        //an example of collector.joining()
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(">,\n<","<< "," >>"));
//
//        System.out.println(theResultStringOfBooks);

// ******************************************************************************
        //work 7.3
        //my way of printing elements of stream operations
//        Forum forum = new Forum();
//        List<ForumUser> list = forum.getUserList().stream()
//                .filter(s -> s.getSex() == 'M')
//                .collect(Collectors.toList());
//        System.out.println("List of male users:");
//        for(int i =0; i<list.size(); i++) {
//            int k = i +1;
//            System.out.println(k + ". " + list.get(i));
//        }
//
//        List<ForumUser> list2 = list.stream()
//                .filter((ForumUser s) -> 2018 - s.getBirthDate() >= 20)
//                .collect(Collectors.toList());
//        System.out.println("\nList of male users at least 20 old are :");
//        for(int i =0; i<list2.size(); i++) {
//            int k = i + 1;
//            System.out.println(k + ". " + list2.get(i));
//        }
//
//        Map<Integer, ForumUser> theMapOfUsers = list2.stream()
////                forum.getUserList().stream()
//                .filter(s -> s.getSex() == 'M')
//                .filter((ForumUser s) -> 2018 - s.getBirthDate() >= 20)
//                .filter((ForumUser forumUser) -> forumUser.getPostCount() >= 1)
//                .collect(Collectors.toMap(ForumUser::getPersonalId, user -> user));
//        System.out.println("\nThe list of special criterions forum has: #" + theMapOfUsers.size() + " user(s).");
//        theMapOfUsers.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//    }
        Forum forum = new Forum();
        Map<Integer, ForumUser> theMapOfUsers = forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter((ForumUser s) -> 2018 - s.getBirthDate() >= 20)
                .filter((ForumUser forumUser) -> forumUser.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getPersonalId, user -> user));
        System.out.println("The list of special criterions forum has: #" + theMapOfUsers.size() + " user(s).");
        theMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
