package com.kodilla.rps.games;

import com.kodilla.rps.exceptions.NullPointerException;

import java.util.Scanner;

public class NewOrEndGame {
    Scanner sc = new Scanner(System.in);

    public void newGame() throws NullPointerException {
        System.out.println("Are you sure you want to start a new game? [Y or N]");
        String choice = sc.next();
        boolean end = false;
        while (!end) {
            if (!(choice.toUpperCase().equals("Y") || choice.toUpperCase().equals("N"))) {
                System.out.println("Please type Y or N");
                choice = sc.next();
            } else if (choice.toUpperCase().equals("Y")) {
                Game game = new Game();
                game.runGame();
                end = true;
            } else {
                end = true;
            }
        }
    }

    public void endGame() throws NullPointerException {
        System.out.println("Are you sure you want to end the game? [Y or N]");
        String choice = sc.next();
        boolean end = false;
        while (!end) {
            if (!(choice.toUpperCase().equals("Y") || choice.toUpperCase().equals("N"))) {
                System.out.println("Please type Y or N");
                choice = sc.next();
            } else
                if (choice.toUpperCase().equals("Y")) {
                System.out.println("Bye :)");
                end = true;
                System.exit(0);
            } else {
                newGame();
                end = true;
            }
        }
    }
}
