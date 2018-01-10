package com.marjancz.module_02;
import java.util.*;
import java.lang.*;
import java.io.*;

class App24
{
    public static void main (String[] args) throws java.lang.Exception
    {
        double a = 24.5;
        char b = 'M';
        boolean c = true;

        Double aPrim = a;
        Character bPrim = b;
        Boolean cPrim = c;


        if(a==aPrim) {
            System.out.println("Value of Primitive Variable \"a\" " + "(" + a + ")" + " equals to value of Object Variable \"aPrim\" " + "(" + aPrim + ")");
        } else {
            System.out.println("Value of Primitive Variable \"a\" " + "(" + a +")" + " not equals to value of Object Variable \"aPrim\" " + "(" + aPrim +")");
        }

        System.out.println("");

        if(b==bPrim) {
            System.out.println("Value of Primitive Variable \"b\" " + "(" + b + ")" + " equals to value of Object Variable \"bPrim\" " + "(" + bPrim + ")");
        } else {
            System.out.println("Value of Primitive Variable \"b\" " + "(" + b + ")" + " not equals to value of Object Variable \"bPrim\" " + "(" + bPrim + ")");
        }

        System.out.println("");

        if(c==cPrim) {
            System.out.println("Value of Primitive Variable \"c\" " + "(" + c + ")" + " equals to value of Object Variable \"cPrim\" " + "(" + cPrim + ")");
        } else {
            System.out.println("Value of Primitive Variable \"c\" " + "(" + c + ")" + " not equals to value of Object Variable \"cPrim\" " + "(" + cPrim + ")");
        }
    }
}
