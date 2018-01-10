package com.marjancz.module_01;
import java.util.*;
import java.lang.*;
import java.io.*;

class UserValidator {
    public boolean validateName(String name) {
        if(name != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateAge(double age) {
        if(age > 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateHeight(double height) {
        if(height > 160) {
            return true;
        } else {
            return false;
        }
    }
}

public class App11 {
    public static void main (String[] args) throws java.lang.Exception {
        System.out.println("Starting...");

        String name = "Adam";
        double age = 40.5;
        double height = 160.2;

        UserValidator user = new UserValidator();

        boolean fakeName = user.validateName(name);
        boolean trueAge = user.validateAge(age);
        boolean trueHeight = user.validateHeight(height);
        if(fakeName) {
            if(trueAge && trueHeight) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
        System.out.println("End of the program.");
    }
}
