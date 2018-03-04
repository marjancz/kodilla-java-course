package com.kodilla.rps;

import java.util.Scanner;

public class NormalGame {
    User user = new User();
    GameMode mode = new GameMode();
    int win = 0, loss = 0, tie = 0, round = 0;
    Scanner sc = new Scanner(System.in);

    private boolean end = false;

    public void runner() {
        System.out.println(user.getName() + " welcome to the Rock, Paper, scissors game");
        System.out.println(mode.gameMode());
        System.out.println("Please type how many won rounds you want to play:");
        int countWin = sc.nextInt();


        while (!end) {

            System.out.println("Please type your choice: scissor(1) ,Rock(2),Paper(3) \nor " +
                    "\nnew game(4) " +
                    "\nexit game(x)");
            int playerMove = sc.nextInt();
            int compMove = (int) (Math.random() * 3 + 1);

            if(playerMove == 4){

            }
            if(playerMove == x) {

            }
            if (playerMove == compMove) {
                tie++;
                System.out.println("Your choice is: " + playerMove +
                        "\nComputer chose: " + compMove +
                        "\nResult: It's a tie" +
                        "\nYou have " + win + " wins and " + loss + " losses");
            } else if ((playerMove - 1) % 3 == (compMove % 3)) {
                win++;
                System.out.println("Your choice is: " + playerMove +
                        "\nComputer chose: " + compMove +
                        "\nResult: You won this round" +
                        "\nYou have " + win + " wins and " + loss + " losses");
            } else if (compMove >= 4) {
                System.out.println("pleas type the correct number)");
            } else {
                loss++;
                System.out.println("Your choice is: " + playerMove +
                        "\nComputer chose: " + compMove +
                        "\nResult: You lost" +
                        "\nYou have " + win + " wins and " + loss + " losses");
            }
            if (win == countWin) {
                end = true;
                System.out.println("You have " + win + " wins. You've won the game!!! :)");
            }
            if (loss == countWin) {
                end = true;
                System.out.println("Comp has " + loss + " wins. You've lost the game :(");
            }
            round++;
        }
    }
}

