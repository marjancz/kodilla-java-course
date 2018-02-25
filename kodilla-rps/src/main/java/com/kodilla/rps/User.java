package com.kodilla.rps;

import java.util.Scanner;

public class User {
    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name:" +
                "\n(minimum 3 characters)" +
                "\n(maximum 8 characters)");
        String user = scanner.next();
        if(user.length() < 3) {
            System.out.println("Too short name!" +
                    "\nPlease type your name again:" +
                    "\n(minimum 3 characters)" +
                    "\n(maximum 8 characters)");
            user = scanner.next();
        }
        if(user.length() > 8) {
            System.out.println("Too long name!" +
                    "\nPlease type your name again:" +
                    "\n(minimum 3 characters)" +
                    "\n(maximum 8 characters)");
            user = scanner.next();
        }
        return user;
    }
}
