package com.marjancz.module_03;
import java.util.*;
import java.lang.*;
import java.io.*;

class RandomObject {
    private ArrayList<String> objectListEvenA;
    private ArrayList<String> objectListOddA;

    public RandomObject(){
        objectListEvenA = new ArrayList<String>();
        objectListOddA = new ArrayList<String>();
    }

    public void objectListEvenOddA(ArrayDeque<String> createObjectsA) {
        Iterator <String> evenOdd = createObjectsA.iterator();
        while(evenOdd.hasNext()) {
            String a = evenOdd.next();
            if((a.length()) %2 == 0) {
                objectListEvenA.add(a);
            } else {
                objectListOddA.add(a);
            }
        }
        createObjectsA.clear();
    }

    public String showEvenOddA() {
        System.out.println(" \n*** Start of creating the Object list with even \"a\" letters. ***\n ");
        for(String evenA : objectListEvenA) {
            System.out.println("Object " + evenA + " has (" + evenA.length() + ") \"a\"");
        }
        System.out.println("Total: " + objectListEvenA.size() + " objects.\n" + " \n*** Start of creating the Object list with odd \"a\" letters. ***\n ");
        for(String oddA : objectListOddA) {
            System.out.println("Object " + oddA + " has (" + oddA.length() + ") \"a\"");
        }
        return  ("Total " + objectListOddA.size() + " objects.");
    }
}

class App34 {

    public static void main (String[] args) throws java.lang.Exception {

        ArrayDeque<String> createObjectsA = new ArrayDeque<String>();
        Random random = new Random();

        for (int n=0; n<50; n++){
            int codeLength = (random.nextInt(50) + 1);
            String a = "a";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < codeLength; i++) {
                sb.append(a);

            }
            String output = sb.toString();
            createObjectsA.offer(output);
            System.out.println("The Object No." + (n+1) + " inludes caption with " + "[" + codeLength + "] letters \"a\"");
        }

        RandomObject randomExecutor = new RandomObject();
        randomExecutor.objectListEvenOddA(createObjectsA);
        System.out.println(randomExecutor.showEvenOddA());
    }
}