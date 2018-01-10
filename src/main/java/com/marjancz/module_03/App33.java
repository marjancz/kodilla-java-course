package com.marjancz.module_03;

import java.util.*;

class SumsRace {

    private int sumaA = 1000;
    private int sumaB = 0;
    private int attemptNo = 0;

    public void startRace() {

        Random randomRace = new Random();
        while(!(sumaA < sumaB)) {
            attemptNo++;
            sumaA += randomRace.nextInt(10);
            sumaB += randomRace.nextInt(50);
            System.out.println("Loop while is in progres... In Attempt[" + attemptNo + "]\n \"sumaA\" is: (" + sumaA + ")" + "and \"sumaB\" is: (" + sumaB + ")");
            System.out.println();
        }
    }
}

class App33 {

    public static void main(String[] args) {

        SumsRace sumsRace = new SumsRace();

        System.out.println("*** Start of \"Race of Sums\" program. ***");
        System.out.println();
        sumsRace.startRace();
        System.out.println("*** End of \"Race of Sums\" program. ***");
    }
}
