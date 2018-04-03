package com.kodilla.rps.players;

import com.kodilla.rps.exceptions.NullPointerException;
import com.kodilla.rps.figures.*;
import com.kodilla.rps.games.NewOrEndGame;

import java.util.Scanner;

public class PlayerMoveNormal {
    Scanner sc = new Scanner(System.in);
    NewOrEndGame newOrEndGame = new NewOrEndGame();
    ComputerMove computerMove = new ComputerMove();
    private String playerMove;
    private boolean end = false;

    public Figure getPlayerMove() throws NullPointerException {
        System.out.println("\nPlease type your choice: Scissors(1), Rock(2), Paper(3) \nor " +
                "\nnew game(n) " +
                "\nexit game(x)");
        playerMove = sc.next();
        Boolean end = false;

        while (!end) {
            if (!(playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3") ||
                    playerMove.equals("n") || playerMove.equals("x"))) {
                System.out.println("Wrong!!! You can only choose from " +
                        " \nScissors(1) ,Rock(2),Paper(3), new game(n), exit game(x)");
                getPlayerMove();
            } else if (playerMove.equals("n")) {
                newOrEndGame.newGame();
                end = true;
            } else if (playerMove.equals("x")) {
                newOrEndGame.endGame();
                end = true;
            }
            end = true;
        }
        switch (playerMove) {
            case "1":
                playerMove = FigureNames.SCISSORS;
                return new Scissors("Scissors", FigureNames.scissorsWinWith());
            case "2":
                playerMove = FigureNames.ROCK;
                return new Rock("Rock", FigureNames.rockWinWith());
            case "3":
                playerMove = FigureNames.PAPER;
                return new Paper("Paper", FigureNames.paperWinWith());
            default:
                return null;
        }
    }
}
