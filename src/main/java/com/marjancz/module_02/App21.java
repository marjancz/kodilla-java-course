package com.marjancz.module_02;

class App21 {
    public static void main (String[] args) throws java.lang.Exception {

        int[] names = new int[20];
        names[0] = 1;
        names[1] = 2;
        names[2] = 3;
        names[3] = 4;
        names[4] = 5;
        names[5] = 6;
        names[6] = 7;
        names[7] = 8;
        names[8] = 9;
        names[9] = 10;
        names[10] = 11;
        names[11] = 12;
        names[12] = 13;
        names[13] = 14;
        names[14] = 15;
        names[15] = 16;
        names[16] = 17;
        names[17] = 18;
        names[18] = 19;
        names[19] = 20;

        double sum = 0;
        for(int i=0; i<names.length; i++) {
            System.out.println("Array elements names[" + i + "] = " + names[i]);
            sum += names[i];
        }
        double average = sum / names.length;
        System.out.println("Average value of Array elements is: " + average);
    }
}
